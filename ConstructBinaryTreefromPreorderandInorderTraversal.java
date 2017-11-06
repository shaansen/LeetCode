import java.util.Arrays;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	
	static int counter = 0;
    
    static public TreeNode recursive(int[] preorder, int[] inorder,int start, int end) {
		
    	System.out.println("--------------------------------------------");
    	System.out.println(Arrays.toString(inorder));
		System.out.println("Start : "+start);
		System.out.println("End   : "+end);
		
    	TreeNode x;
    	if(start > end){
			x = null;
		} else if(start == end) {
			x = new TreeNode(preorder[counter++]);
		} else {
		int val = preorder[counter++];
		int y = getRoot(val,inorder,start,end);
		System.out.println("Y : "+y);
		x = new TreeNode(val);
		x.left = recursive(preorder, inorder, start, y-1);
		x.right = recursive(preorder, inorder, y+1, end);
		}		
		
		return x;
	}
	
	static public int getRoot(int val, int[] inorder,int start, int end) {
		System.out.println("Val : "+val);
		int j;
		for (j = start; j <= end; j++) {
				if(val==inorder[j])
					return j;
			}
		return j;
	}
	
	static public TreeNode buildTree(int[] preorder, int[] inorder) {
		return recursive(preorder, inorder, 0, inorder.length-1);
    }
	
	public static void inOrder(TreeNode node) { 
		if (node == null) 
		{ return; } 
		
		inOrder(node.left); 
		System.out.printf("%s ", node.val); 
		inOrder(node.right); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] pre = {1, 2, 4, 5, 3};
		//int[] in = {4, 2, 5, 1, 3};
		int[] pre = {7,-10,-4,3,-1,2,-8,11};
		int[] in = {-4,-10,3,-1,7,11,-8,2};
		//int[] pre = {1};
		//int[] in = {1};
		//int[] pre = {1,2};
		//int[] in = {2,1};
		TreeNode x = buildTree(pre, in);
		inOrder(x);
	}
}
