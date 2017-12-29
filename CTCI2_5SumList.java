import java.util.HashSet;

public class CTCI2_5SumList {
	
	public static ListNode SumList(ListNode x,ListNode y) {
		
		ListNode head = x;
		while(x!=null && y!=null) {
			x.val = x.val+y.val;
			x = x.next;
			y = y.next;
		}
		
		ListNode head2 = head;
		int pcarry = 0;
		int carry = 0;
		while(head2!=null) {
			carry = head2.val+pcarry>9 ? 1 : 0;
			head2.val = (head2.val+pcarry)%10;
			pcarry = carry;
			head2 = head2.next;
		}
		if(pcarry==1) {
			ListNode last = new ListNode(1);
			last.next = head;
			head = last;
		}
		
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
		// TODO Auto-generated method stub
		
		ListNode x = new ListNode(1);
		ListNode x1 = x;
		
		
		ListNode y = new ListNode(9);
		ListNode y1 = y;
		y.next = new ListNode(9);
		y = y.next;
		y.next = new ListNode(9);

		printLinkedList(x1);
		printLinkedList(y1);
		printLinkedList(SumList(x1, y1));
		
	}
}
