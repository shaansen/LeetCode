import java.util.HashSet;

public class CTCI2_3DeleteMiddleNode {
	
	public static void deleteMiddleNode(ListNode x) {
		ListNode y = x;
		if(x==null && x.next==null) {
			return;
		}
		ListNode next = x.next;
		x.val = next.val;
		x.next = next.next;
		return;
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
		// TODO Auto-generated method stub
		
		ListNode x = new ListNode(1);
		ListNode y = x;
		
		x.next = new ListNode(2);
		x = x.next;
		x.next = new ListNode(3);
		x = x.next;
		x.next = new ListNode(4);
		
		x = x.next;
		ListNode z = x;
		x.next = new ListNode(5);
		x = x.next;
		x.next = new ListNode(6);
		x = x.next;
		x.next = new ListNode(7);
		x = x.next;
		
		deleteMiddleNode(z);
		printLinkedList(y);
		
	}
}
