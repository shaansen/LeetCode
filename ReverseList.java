
public class ReverseList {
	
	static public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = head;
        
        while(current.next!=null) {
        	next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        }
        head = prev;    
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
