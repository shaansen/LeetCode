import java.util.HashSet;

public class CTCI2_4PartitionLinkedList {
	
	public static ListNode partitionLinkedList(ListNode x,int val) {
		ListNode head = x;
		ListNode runner = x;
		int counter = 1;
		while(runner.next!=null) {
			counter++;
			runner = runner.next;
		}
		
		ListNode current = head;
		
		while(counter>-1) {
			
			if(head.val>=val) {
				runner.next = new ListNode(head.val);
				runner = runner.next;
				head = head.next;
				current = head;
				
			} else if(current.next.val>=val) {
				runner.next = new ListNode(current.next.val);
				runner = runner.next;
				current.next = current.next.next;
				
			} else {
				current = current.next;
			}
			counter--;
			
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
		
		ListNode x = new ListNode(3);
		ListNode y = x;
		x.next = new ListNode(5);
		x = x.next;
		x.next = new ListNode(8);
		x = x.next;
		x.next = new ListNode(5);
		x = x.next;
		x.next = new ListNode(10);
		x = x.next;
		x.next = new ListNode(2);
		x = x.next;
		x.next = new ListNode(1);
		x = x.next;
		printLinkedList(y);
		printLinkedList(partitionLinkedList(y,3));
		
	}
}
