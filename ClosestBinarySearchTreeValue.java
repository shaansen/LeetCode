
public class ClosestBinarySearchTreeValue {
	
	public static int min;
	public static int minRoot;
	
	public static void rec(TreeNode root, double target) {
        if(root == null) {
        	return;
        }
        if(min < Math.abs(root.val-target)) {
        	min = (int) Math.abs(root.val-target);
        	minRoot = root.val;
        }
        rec(root.left, target);
        rec(root.right, target);
    }
	
	public static int closestValue(TreeNode root, double target) {
        min = Integer.MAX_VALUE;
        minRoot = root.val;
        rec(root, target);
        return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
