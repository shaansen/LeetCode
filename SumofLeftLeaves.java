
public class SumofLeftLeaves {
	
	public static int handler(TreeNode root, int left) {
		
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			if(left == 1) {
				return 0;
			} else {
				return root.val;
			}
		}
		return handler(root.left, 0) + handler(root.right, 1);
	}
	
	public static int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root.left==null && root.right==null) {
        	sum = handler(root, 1);
        } else {
        	sum = handler(root, 0);
        }
        
        return sum;
    }

	public static void main(String[] args) {


	}

}
