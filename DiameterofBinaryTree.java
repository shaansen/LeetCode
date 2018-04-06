
public class DiameterofBinaryTree {
	
	public static int getMaxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1+Math.max(getMaxDepth(root.left), getMaxDepth(root.right));
	}
	
	public static int diameterOfBinaryTree(TreeNode root) {
        int x = getMaxDepth(root.left)+getMaxDepth(root.right);
        return Math.max(Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)),x);
    }

	public static void main(String[] args) {


	}
}
