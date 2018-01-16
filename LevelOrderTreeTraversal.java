import java.util.*;

public class LevelOrderTreeTraversal {
	
	public static int heightOfTree(TreeNode root) {
		if(root == null) {
			return 0;
		} else {
			return 1+Math.max(heightOfTree(root.left),heightOfTree(root.right));
		}
	}
	
	public static List<Integer> result;
	
	public static void recur(TreeNode root, int level, int direction) {
		if(root == null) {
			return;
		} else if(level == 1) {
			
			if(direction == 1) {
				result.add(root.val);
			} else {
				result.add(0,root.val);
			}
			return;
		} else {
			recur(root.left, level-1, direction);
			recur(root.right, level-1, direction);
		}
	}
	
	public static List<List<Integer>> levelOrderTraversalDriver(TreeNode root) {
		int h = heightOfTree(root);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 1; i < h+1; i++) {
			result = new ArrayList<Integer>();
			recur(root,i, i%2);
			list.add(result);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b = new BinaryTree();
		b.root = new TreeNode(3);
		b.root.left = new TreeNode(9);
		b.root.right = new TreeNode(20);
		b.root.right.left = new TreeNode(15);
		b.root.right.right = new TreeNode(7);
//		b.root.left.left = new TreeNode(20);
//		b.root.left.right = new TreeNode(37);
		System.out.println(levelOrderTraversalDriver(b.root));
	}

}
