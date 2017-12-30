
public class SwapPairs {
	
	public static ListNode swapPairs(ListNode head) {
        if(head==null) {
        	return null;
        } else if(head.next==null) {
        	return head;
        }
        
        ListNode odd  = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even.next!=null) {
        	System.out.println("O:"+odd.val+"\tE:"+even.val);
        	ListNode temp1 = even.next.next;
        	ListNode temp2 = even.next;
        	even.next = odd;
        	odd.next = temp1;
        	
        	odd = temp2;
        	even = odd.next;
        	
        	printLinkedList(evenHead);
        	System.out.println("======================================================");
        }
        
        return evenHead;
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
		printLinkedList(swapPairs(y1));
	}

}
