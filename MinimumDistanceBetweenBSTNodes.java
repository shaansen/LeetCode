
public class MinimumDistanceBetweenBSTNodes {
	
	static TreeNode previous;
    static int minimum;
    
    public void inorder(TreeNode root) {
		if(root == null) {
            return;
        }
        inorder(root.left);
        if(previous != null) {
            //System.out.println("Calculating Difference between "+root.val+" and "+previous.val);
            minimum = Math.min(minimum, root.val - previous.val);
        }
        previous = root;
        inorder(root.right);
	}
	
	public int minDiffInBST(TreeNode root) {
        previous = null;
        minimum = Integer.MAX_VALUE;
        inorder(root);
        return minimum;
    }

	public static void main(String[] args) {


	}

}
