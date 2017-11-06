/*class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
public class deleteLinkedList {
	
	static  public ListNode removeElements(ListNode head, int val) {
        if(head.val == val) {
        	ListNode x = head.next;
        	head = x;
        } else {
        	ListNode current = head;
        	while(current.next!=null && current.next.val!=val) {
        		current = current.next;
        	}
        	current.next = current.next.next;
        }
        
        return head;
    }
	
	static public void printLinkedList(ListNode head) {
		while(head!=null) {
			System.out.print(head.val+ " -> ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/