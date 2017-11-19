
public class SplitlinkedListinParts {
	
	static int getSize(ListNode root) {
		if(root==null) {
			return 0;
		}
		return 1+getSize(root.next);
	}
	
	static public ListNode[] splitListToParts(ListNode root, int k) {
		
        int t = getSize(root);
        int n = t/k;
        int r = t%k;
        ListNode[] res = new ListNode[k];
        ListNode current = root;
        ListNode temp = root;
        
        for (int i = 0; i < k; i++) {
        	res[i] = current;
			for (int j = 0; j < n + (r > 0 ? 1 : 0) && current!=null; j++) {
				temp = current;
				current = current.next;
			}
			if(temp!=null) {
				temp.next = null;
			}
			r--;
		}
        
        return res;
    }
	
	public static void printListNodeList(ListNode[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print("[");
			printListNode(x[i]);
			System.out.print("]");
			System.out.println();
			
		}
	}
	
	public static void printListNode(ListNode x) {
		while(x != null) {
			System.out.print(x.val+"->");
			x = x.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		printListNodeList(splitListToParts(head, 3));

	}

}
