import java.util.HashSet;

public class CTCI2_2ReturnKToLast {
	
public static int IterativereturnKthToLast(ListNode x, int k) {
		
		ListNode current = x;
		ListNode runner = x;
		for (int i = 0; i < k; i++) {
			runner = runner.next;
		}
		while(runner.next!=null) {
			runner = runner.next;
			current = current.next;
		}
		return current.val;
	}

	public static int RecursiveturnKthToLast(ListNode x, int k) {
		
		if(x==null) {
			return 0;
		}
		int index = RecursiveturnKthToLast(x.next, k) + 1;
		if(index == k) {
			return x.val;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode x = new ListNode(1);
		ListNode y = x;
		x.next = new ListNode(2);
		x = x.next;
		x.next = new ListNode(3);
		x = x.next;
		x.next = new ListNode(4);
		x = x.next;
		x.next = new ListNode(5);
		x = x.next;
		x.next = new ListNode(6);
		x = x.next;
		x.next = new ListNode(7);
		x = x.next;
		
		System.out.println(IterativereturnKthToLast(y, 6));
		
	}
}
