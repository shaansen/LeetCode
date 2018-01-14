public class BinarySearchTree {
	
	public static boolean binarySearch(TreeNode root, int key) {
		if(root == null) {
			return false;
		} else if(root.val == key) {
			//System.out.println("Found it");
			return true;
		} else if(root.val > key) {
			//System.out.println("Searching in the left:\t"+root.val);
			return binarySearch(root.left, key);
		} else {
			//System.out.println("Searching in the right:\t"+root.val);
			return binarySearch(root.right, key);
		}
	}
	
	public static TreeNode insert(TreeNode root, int key) {
		if(root == null) {
			return new TreeNode(key);
		} else if(root.val > key) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);	
		}
		return root;
	}
	
	
	public static TreeNode insertI(TreeNode root, int key) {
		System.out.println();
		if(root == null) {
			return new TreeNode(key);
		} 
		
		TreeNode current = root, parent = null;
		while(current != null) {
			parent = current;
			if(current.val < key) {
				System.out.println("Moving right "+current.val);
				current = current.right;
			} else {
				System.out.println("Moving left "+current.val);
				current = current.left;
			}
		}
		
		
		
		if(parent.val < key) {
			System.out.println("Finally placing it on the left of "+parent.val);
			parent.right = new TreeNode(key);
		} else {
			System.out.println("Finally placing it on the right of "+parent.val);
			parent.left = new TreeNode(key);
		}
		
		return root;
		
	}
	
	public static void preOrder(TreeNode root) {
		if(root!=null) {
			System.out.print(root.val+"\t");
			preOrder(root.left);
			preOrder(root.right);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b = new BinaryTree();
		b.root = new TreeNode(10);
		b.root.left = new TreeNode(-5);
		b.root.right = new TreeNode(30);
		b.root.left.left = new TreeNode(-10);
		b.root.left.right = new TreeNode(0);
		b.root.left.right.right = new TreeNode(5);
		b.root.right.right = new TreeNode(36);
		preOrder(b.root);
		//System.out.println(binarySearch(b.root,5));
		b.root = insertI(b.root, 25);
		System.out.println();
		preOrder(b.root);
	}

}
