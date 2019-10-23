
public class Queue {
	Node head, tail;
	
	void enter(int x) 
	{
		// Queue is empty
		if (head == null) {
			head = tail = new Node(x, null);
			return;
		}
		
		tail.next = new Node(x, null);
		tail = tail.next;
		
		// Queue had only one element
		if (head.next == null) {
			head.next = tail;
		}
	}
	
	int leave()
	{
		// Queue is empty
		// TODO: Raise exception
		if (head == null) {
			return 0;
		}
		
		int returnValue = head.data;
		
		head = head.next;
		
		return returnValue;
	}
}
