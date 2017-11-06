import java.util.*;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class MaxBinaryTree {
	
	public static void inOrder(TreeNode node) { 
		if (node == null) 
		{ return; } 
		
		inOrder(node.left); 
		System.out.printf("%s ", node.val); 
		inOrder(node.right); 
	}
	
	public static TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root;
		if(nums.length == 0) {
        	root = null;
        } else {
        	int max = Integer.MIN_VALUE;
        	int index = 0;
        	for (int i = 0; i < nums.length; i++) {
				if(max < nums[i]) {
					max = nums[i];
					index = i;
				}
			}
        	root = new TreeNode(max);
        	root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,index));
        	root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,index+1,nums.length));
        			
        }      
		
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {3,2,1,6,0,5};
		TreeNode y = constructMaximumBinaryTree(x);
		inOrder(y);
	}

}
