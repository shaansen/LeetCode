
public class ReverseLinkedList {
	
	public static ListNode reverseLinkedList(ListNode x) {
		ListNode current = x;
		ListNode previous = null;
		
		while(current.next != null) {
			ListNode temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		current.next = previous;
		
		return current;
	}
	
	public static void printLinkedList(ListNode x) {
	  ListNode current = x;
	  while(current!=null) {
		  System.out.print(current.val+" -> ");
		  current = current.next;
	  }
	  System.out.println();
	}

	public static void main(String[] args) {
		
		ListNode y = new ListNode(1);
		ListNode y1 = y;
		y.next = new ListNode(2);
		y = y.next;
		y.next = new ListNode(3);
		y = y.next;
		y.next = new ListNode(4);
		y = y.next;
		y.next = new ListNode(5);
		y = y.next;
		y.next = new ListNode(6);
		y = y.next;
		y.next = new ListNode(7);
		y = y.next;
		y.next = new ListNode(8);
		y = y.next;
		y.next = new ListNode(9);
		y = y.next;
		y.next = new ListNode(10);
		y = y.next;
		printLinkedList(reverseLinkedList(y1));
	}
}
