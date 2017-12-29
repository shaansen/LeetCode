import java.awt.Event;

public class OddEvenLinkedList {
	
	public static ListNode oddEvenList(ListNode head) {
		
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		
		while(even!=null && even.next!=null) {
			odd.next  = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
			
		}
		odd.next = evenHead;
		
		return head;
		
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
		printLinkedList(y1);
		printLinkedList(oddEvenList(y1));
	}

}
