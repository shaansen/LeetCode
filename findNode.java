
public class findNode {
	
	public static boolean findNode(TreeNode root,int x) {
		if(root == null) {
			return false;
		} else if(root.val == x) {
			return true;
		}
		return findNode(root.left, x) || findNode(root.right, x);
	}
	
	public static int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1+Math.max(getHeight(root.left),getHeight(root.right));
	}
	
	public static void printLevelOrderTraversal(TreeNode root,int level) {
		if(root == null) {
			return;
		}
		if(level == 1) {
			System.out.print(root.val+"\t");
		} else {
			printLevelOrderTraversal(root.left, level-1);
			printLevelOrderTraversal(root.right, level-1);
		}
	}
	
	public static void levelOrderTraversal(TreeNode root) {
		int h = getHeight(root);
		for (int i = 1; i <= h; i++) {
			printLevelOrderTraversal(root,i);
			System.out.println();
		}
	}
	
	public static void preOrderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void postOrderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		postOrderTraversal(root.left);
		System.out.print(root.val+" ");
		postOrderTraversal(root.right);
	}
	
	public static TreeNode insertNode(TreeNode root, int x) {
		if(root == null) {
			return new TreeNode(x);
		} else if(root.val < x) {
			root.right = insertNode(root.right, x);
		} else {
			root.left = insertNode(root.left, x);
		}
		return root;
	}
	
	public static int sizeOfTree(TreeNode root) {
		if(root == null) {
			return 0;
		} 
		return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(10);
		
		root1= new TreeNode(1);
		root1.left= new TreeNode(2);
		root1.right= new TreeNode(3);
		root1.left.left= new TreeNode(4);
		root1.left.right= new TreeNode(5);
		root1.left.left.left = new TreeNode(6);
		root1.left.left.right = new TreeNode(7);
		root1.left.right.left = new TreeNode(8);
		root1.left.right.right = new TreeNode(9);
		preOrderTraversal(root1);
		insertNode(root1, 10);
		System.out.println();
		preOrderTraversal(root1);
		System.out.println();
		System.out.println(sizeOfTree(root1));
		

	}
}
