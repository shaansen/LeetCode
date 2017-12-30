
public class PalindromeLinkedList {
	
	public static  boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null) {
        	return false;
        } else if(head.next==null) {
        	return true;
        } 
        
        int d = getLengthLinkedList(head);
        int n = (int) Math.floor(d/2) - 1;
        //System.out.println(n);
        
        ListNode first = head;
        ListNode prev = null;
        
        for (int i = 0; i < n; i++) {
			ListNode temp = first.next;
			first.next = prev;
			prev = first;
			first = temp;
		}
        ListNode second = first.next;
        first.next = prev;
        
        second = d%2==1 ? second.next : second;
        printLinkedList(first);
        printLinkedList(second);
        while(first!=null && second!=null) {
        	if(first.val!=second.val) {
        		return false;
        	}
        	first = first.next;
        	second = second.next;
        }
        
        return true;
    }
	
	public static void printLinkedList(ListNode x) {
		  ListNode current = x;
		  while(current!=null) {
			  System.out.print(current.val+" -> ");
			  current = current.next;
		  }
		  System.out.println();
		}

	public static int getLengthLinkedList(ListNode x) {
		  int c = 0;
		  ListNode current = x;
		  while(current!=null) {
			  c++;
			  current = current.next;
		  }
		  return c;
		}

	public static void main(String[] args) {
		
		ListNode y = new ListNode(1);
		ListNode y1 = y;
		y.next = new ListNode(1);
		y = y.next;
		y.next = new ListNode(2);
		y = y.next;
		y.next = new ListNode(1);
		y = y.next;
//		y.next = new ListNode(5);
//		y = y.next;
//		y.next = new ListNode(5);
//		y = y.next;
//		y.next = new ListNode(4);
//		y = y.next;
//		y.next = new ListNode(3);
//		y = y.next;
//		y.next = new ListNode(2);
//		y = y.next;
//		y.next = new ListNode(1);
//		y = y.next;
//		y.next = new ListNode(10);
//		y = y.next;
		System.out.println(isPalindrome(y1));
	}
}
