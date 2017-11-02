class Node {
	Node left;
	Node right;
	int val;
	
	public Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class BST {
	Node root;	
	
	public BST() {
		root = null;
	}
	
	void insert(int x) {
		this.root = insertRec(root,x);
	}
	
	Node insertRec(Node root, int value) {
		if(root == null) {
			return new Node(value);
		} 
		
		if(value < root.val) {
			root.left  =  insertRec(root.left,value);
		} else if(value > root.val) {
			root.right =  insertRec(root.right,value);
		}
		return root;
	}
	
	void inorder() {
		inorderRec(root);
	}
	
	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.val+"\t");
			inorderRec(root.right);
		}
	}
}

public class searchBinaryTree {
	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(15);
		tree.inorder();
	}
}
