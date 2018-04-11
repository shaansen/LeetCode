
public class PlusOneLinkedList {
	
	public static int carry;
	
	public static void addSum(ListNode head) {
		if(head.next == null) {
			int x = (head.val+1)%10;
			int y = (head.val+1)/10;
			head.val = x;
			carry = y;
			return;
		}
		addSum(head.next);
		int x = (head.val+carry)%10;
		int y = (head.val+carry)/10;
		head.val = x;
		carry = y;
	}
	
	public static ListNode plusOne(ListNode head) {
		carry = 0;
        addSum(head);
        if(carry == 1) {
        	ListNode extra = new ListNode(carry);
        	extra.next = head;
        	head = extra;
        }
        return head;
    }
	
	public static void printLinkedList(ListNode head) {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.val+" -> ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(0);
		ListNode l3 = new ListNode(0);
		l2.next = l3;
		l1.next = l2;
		printLinkedList(plusOne(l1));

	}

}
