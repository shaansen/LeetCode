import java.util.HashMap;
import java.util.Map;

public class BinaryTreeMaximumPathSum {
	
	public static int max;
	
	public static int findMax(TreeNode root) {
		
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
        int left  = Math.max(findMax(root.left),Integer.MIN_VALUE);
        int right = Math.max(findMax(root.right),Integer.MIN_VALUE);
        
        max = Math.max(max, root.val+left+right);
        int result = root.val+Math.max(left,right);
        return result;
	}
	
	public static int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        findMax(root);
        return max;
    }

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(-5);
		TreeNode root2 = new TreeNode(-10);
		TreeNode root3 = new TreeNode(15);
		TreeNode root4 = new TreeNode(-50);
		TreeNode root5 = new TreeNode(-10);
		TreeNode root6 = new TreeNode(25);
		TreeNode root7 = new TreeNode(10);
		TreeNode root8 = new TreeNode(20);
		TreeNode root9 = new TreeNode(-10);
		
		root2.left = root4;
		root2.right = root5;
		
		root7.left = root8;
		root7.right = root9;
		
		root3.left = root6;
		root3.right = root7;
		
		root1.left = root2;
		root1.right = root3;
		
		
		System.out.println(maxPathSum(root1));
		
	}

}
