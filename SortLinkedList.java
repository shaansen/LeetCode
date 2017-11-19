import java.util.Arrays;
import java.util.LinkedList;

public class SortLinkedList {
	
	static public Integer[] convertLinkedListToArray(ListNode x) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(x!=null) {
			list.add(x.val);
			x = x.next;
		}
		
		return list.toArray(new Integer[list.size()]);
	}
	
	static public ListNode convertArrayToLinkedList(Integer[] x) {
		if(x.length == 0) {
			return null;
		}
		
		ListNode y = new ListNode(x[0]);
		ListNode current = y;
		for (int i = 1; i < x.length; i++) {
			current.next = new ListNode(x[i]);
			current = current.next;
		}
		return y;
	}
	
	static public void merge(Integer[] arr,int l,int m,int r) {
		int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	    Integer[] L = new Integer[n1];
	    Integer[] R = new Integer[n2];
	 
	    for (i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for (j = 0; j < n2; j++)
	        R[j] = arr[m + 1+ j];
	 
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}	
	
	static public void mergedSortedArray(Integer[] arr,int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			mergedSortedArray(arr, l, m);
			mergedSortedArray(arr, m+1, r);
			merge(arr,l,m,r);
		}
	}

	static public ListNode sortList(ListNode head) {
        Integer[] arr = convertLinkedListToArray(head);
        mergedSortedArray(arr,0,arr.length-1);
        return convertArrayToLinkedList(arr);
    }
	
	static public void print(ListNode x) {
		while(x!=null) {
			System.out.print(x.val + " -> ");
			x = x.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		head.next = new ListNode(2);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(50);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		ListNode x = sortList(head);
		print(x);

	}

}
