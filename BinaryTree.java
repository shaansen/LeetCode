import java.util.*;

public class BinaryTree {
	
	static TreeNode root;
	
	public static void preOrder(TreeNode root) {
		if(root!=null) {
			System.out.print(root.val+" -> ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(TreeNode root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.val+" -> ");
		}	
	}
		
	public static void inOrder(TreeNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.val+" -> ");
			inOrder(root.right);
		}	
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>(); 
		Queue<TreeNode> currentQueue = new LinkedList<TreeNode>();
		Queue<TreeNode> subQueue = new LinkedList<TreeNode>();
		LinkedList<Integer> subList = new LinkedList<Integer>();
		currentQueue.add(root);
		
		while(!currentQueue.isEmpty()) {
			TreeNode x = currentQueue.poll();
			subList.add(x.val);
			System.out.println(subList);
			if(x.left!=null)
				subQueue.add(x.left);
			if(x.right!=null)
				subQueue.add(x.right);
			if(currentQueue.isEmpty()) {
				list.add(0,subList);
				subList = new LinkedList<Integer>();
				Queue<TreeNode> temp = new LinkedList<TreeNode>();
				temp = currentQueue;
				currentQueue = subQueue;
				subQueue = temp;
				
			}
		}
		return list;
	}
	
	
	
	public static void main(String args[]) {
		BinaryTree b = new BinaryTree();
		b.root = new TreeNode(1);
		b.root.left = new TreeNode(2);
		b.root.right = new TreeNode(3);
		b.root.left.left = new TreeNode(4);
		b.root.right.left = new TreeNode(6);
		b.root.left.right = new TreeNode(5);
		b.root.right.right = new TreeNode(7);
		
/*		
		preOrder(b.root);
		System.out.println();
		postOrder(b.root);
		System.out.println();
		inOrder(b.root);
		System.out.println();*/
		System.out.print(levelOrder(root));
	}

}
