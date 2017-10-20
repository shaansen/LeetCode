class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    
    public ListNode actualAction(ListNode l1, ListNode l2,int pcarry) {
        if(l1 == null && l2 != null) {
            int sum = (l2.val + pcarry)%10;
            int carry = (l2.val + pcarry)/10;
            l2.val = sum;
            if(carry!=0) {
                ListNode t = new ListNode(1);
                l2.next = t;
            }
            return l2;
        }
        if(l2 == null && l1 != null) {
            int sum = (l1.val + pcarry)%10;
            int carry = (l1.val + pcarry)/10;
            l1.val = sum;
            if(carry!=0) {
                ListNode t = new ListNode(1);
                l1.next = t;
            }
            return l1;
        }
        if(l2 == null && l1 == null) {
            return l1;
        }
        
        int sum = (l1.val+l2.val+pcarry)%10;
        int carry = (l1.val+l2.val+pcarry)/10;
        l1.val = sum;
        ListNode x;
        if(l1.next==null && l2.next==null && carry!=0) {
            x = new ListNode(carry);
        } else {
            x = actualAction(l1.next,l2.next,carry);
        }
        l1.next = x;
        return l1;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return actualAction(l1,l2,0);        
    }
}