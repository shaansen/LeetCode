
public class SameTree {
	
	public static boolean sameTree(TreeNode root1,TreeNode root2) {
		int x = root1==null ? -1 : root1.val;
		int y = root2==null ? -1 : root2.val;
		if(root1==null || root2==null) {
			return root1==root2;
		} 
		return root1.val==root2.val && sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
	}
	
	public static void preOrder(TreeNode root) {
		if(root!=null) {
			System.out.print(root.val+"\t");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static int sizeOfTree(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
	}
	
	public static int heightOfTree(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return 1+Math.max(heightOfTree(root.left),heightOfTree(root.right));
	}
	
	public static int rootToLeaveSum(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return root.val+Math.max(rootToLeaveSum(root.left),rootToLeaveSum(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree b1 = new BinaryTree();
		b1.root = new TreeNode(10);
		b1.root.left = new TreeNode(-5);
		b1.root.right = new TreeNode(30);
		b1.root.left.left = new TreeNode(-10);
		b1.root.left.right = new TreeNode(0);
		b1.root.left.right.right = new TreeNode(5);
		b1.root.right.right = new TreeNode(36);
		
		BinaryTree b2 = new BinaryTree();
		b2.root = new TreeNode(10);
		b2.root.left = new TreeNode(16);
		b2.root.right = new TreeNode(5);
		b2.root.left.right = new TreeNode(-3);
		b2.root.right.left = new TreeNode(6);
		b2.root.right.right = new TreeNode(11);
		
		System.out.println(sizeOfTree(b1.root));
		System.out.println(heightOfTree(b1.root));
		System.out.println(rootToLeaveSum(b2.root));
		
		
	}

}
