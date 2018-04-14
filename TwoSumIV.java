import java.util.*;

public class TwoSumIV {
	
	public static List<Integer> list;
	
	public static void getAllNodes(TreeNode root) {
		if(root==null) {
			return;
		}
		getAllNodes(root.left);
		list.add(root.val);
		getAllNodes(root.right);
	}
	
	public boolean findTarget(TreeNode root, int k) {
        list = new LinkedList<Integer>();
        getAllNodes(root);
        Integer[] a = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(a));
        int i = 0;
        int j = a.length-1;
        while(i<j) {
        	if(a[i]+a[j] == k) {
        		return true;
        	} else if(a[i]+a[j]<k) {
        		i++;
        	} else {
        		j--;
        	}
        }
        return false;
    }
	
	public static void main(String[] args) {

	}

}
