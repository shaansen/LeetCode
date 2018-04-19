
public class IntersectionOfLinkedList {
	
	public static int len(ListNode head) {
        int count = 0;
        while(head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB==null) {
            return null;
        }
        
        int a = len(headA);
        int b = len(headB);
        
        System.out.println(a+" | "+b);
        
        if(a < b) {
            ListNode temp = headA;
            headA = headB;
            headB = temp;
            int temp2 = a;
            a = b;
            b = temp2;
        }
        
        
        for(int i=0;i<a-b;i++) {
        	headA = headA.next;     
        }
        
        while(headA!=null && headB!=null) {
            System.out.println(headA.val+","+headB.val);
            if(headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

	public static void main(String[] args) {
		ListNode headA = new ListNode(3);
		ListNode headB = new ListNode(2);
		headB.next = headA;
		System.out.println(getIntersectionNode(headA, headB));

	}

}
