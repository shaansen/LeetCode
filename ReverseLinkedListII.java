
public class ReverseLinkedListII {
	
	static public ListNode reverseList(ListNode head,int count) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = head;
        
        while(current.next!=null && count > 0) {
        	next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        	count--;
        }
        head = prev;    
        return head;
    }

	static public ListNode reverseListII(ListNode head,int start, int end) {
        ListNode current = head;
        int i=0;
        while(i++<start) {
        	current = current.next;
        }
        current = reverseList(current,end-start+1);
        while(current!=null) {
        	current = current.next;
        }       
        
        return head;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
