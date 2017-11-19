import java.util.*;

public class RemoveFriends {
	
	public static ListNode convertArrayToLinkedList(int[] a) {
		ListNode x = new ListNode(a[0]);
		ListNode y = x;
		for (int i = 1; i < a.length; i++) {
			y.next = new ListNode(a[i]);
			y = y.next;
		}
		return x;
	}
	
	public static void printLinkedList(ListNode x) {
		while(x!=null) {
			System.out.print(x.val+" ");
			x = x.next;
		}
	}
	
	
	public static void findFriends(int[] a,int k) {
		
		if(k==0) {
			printLinkedList(convertArrayToLinkedList(a));
			return;
		}
		
		ListNode y = null;
		ListNode x = null;
		boolean bool = false;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]<a[i+1] && k > 0) {
				bool = true;
				k--;
			} else {
				if(y==null) {
					x = new ListNode(a[i]);
					y = x;
				} else {
					y.next = new ListNode(a[i]);
					y = y.next;
				}
			}
		}
		if(bool && y!=null) {
			y.next = new ListNode(a[a.length-1]);
		} else if(!bool && k>0){
			k--;
		}
		while(k>0) {
			k--;
			x = x.next;
		}
		
		printLinkedList(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {100,3,1};
		int[] a2 = {19, 12, 3, 4, 17};
		int[] a3= {23, 45, 11, 77, 18};
		findFriends(a1,2);
	}

}
