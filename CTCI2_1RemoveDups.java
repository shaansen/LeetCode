import java.util.HashSet;

public class CTCI2_1RemoveDups {
	
	public static ListNode removeDuplicatesWithExtraSpace(ListNode x) {
		
		// To maintain the head 
		ListNode head = x;
		
		if(head==null) {
			return null;
		}

		// To maintain counter
		ListNode current = x;
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(current.val);
		while(current.next!=null) {
			if(set.contains(current.next.val)) {
				current.next = current.next.next;
			} else {
				set.add(current.next.val);
				current = current.next;
			}
		}

		return head;
	}
	
	public static ListNode removeDuplicatesWithoutExtraSpace(ListNode x) {
		
		System.out.println("Without Extra Space");
		// To maintain the head 
		ListNode head = x;
		
		if(head==null) {
			return null;
		}

		// To maintain counter
		ListNode current = x;
		
		while(current!=null) {
			ListNode fast = current.next;
			while(fast!=null) {
				System.out.println("Slow : "+current.val+"\tFast : "+fast.val);
				if(fast.val==current.val) {
					fast.val = -1;
				}
				fast = fast.next;
			}
			current = current.next;
		}
		
		current = head;
		while(current.next!=null) {
			if(current.next.val == -1) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
			
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
		ListNode y = x;
		x.next = new ListNode(1);
		x = x.next;
		x.next = new ListNode(1);
		x = x.next;
		x.next = new ListNode(1);
		x = x.next;
		x.next = new ListNode(2);
		x = x.next;
		x.next = new ListNode(3);
		x = x.next;
		x.next = new ListNode(4);
		x = x.next;
		printLinkedList(y);
		System.out.println();
		//printLinkedList(removeDuplicatesWithExtraSpace(y));
		printLinkedList(removeDuplicatesWithoutExtraSpace(y));
		
	}
}
