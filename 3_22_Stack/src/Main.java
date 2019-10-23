
public class Main {
	public static void main(String[] args) {
		
		// initializing test data
		Node[] nodes = new Node[5];
		for (int i = 0; i < nodes.length; i++)
		{
			nodes[i] = new Node();
			nodes[i].data = i;
		}
		
		Stack stack = new Stack();
		
		// Testing if pop with empty stack works
		if (stack.pop() == null) {
			System.out.println("Popping empty stack works");
		}
		else {
			System.out.println("Popping empty stack doesn't work");
		}
		
		// Pushing data on the stack
		for (int i = 0; i < nodes.length; i++) {
			stack.push(nodes[i]);
		}
		
		// Checking if push worked correctly
		boolean pushIsWorking = true;
		for (int i = nodes.length - 1; i >= 0; i--) {
			if (stack.pop().data != nodes[i].data) {
				pushIsWorking = false;
				break;
			}
		}
		
		if (pushIsWorking) {
			System.out.println("Push is working correctly");
		}
		else {
			System.out.println("Push doesn't work");
		}
		
		if (stack.pop() == null) {
			System.out.println("Pop is working");
		}
	}
}
