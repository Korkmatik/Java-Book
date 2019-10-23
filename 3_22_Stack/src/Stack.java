
public class Stack {
	Node top;
	
	void push(Node node)
	{
		if (node == null) {
			return;
		}
		
		// No elements on the stack
		if (top == null) 
		{
			this.top = node;
			return;
		}
		
		node.next = top;
		top = node;
	}
	
	Node pop()
	{
		// Stack is empty
		if (top == null)
		{
			return null;
		}
		
		Node returnValue = top;
		top = top.next;
		
		return returnValue;
	}
}
