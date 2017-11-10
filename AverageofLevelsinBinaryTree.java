import java.util.*;

public class AverageofLevelsinBinaryTree {
	
	static public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new LinkedList<Double>(); 
		Queue<TreeNode> currentQueue = new LinkedList<TreeNode>();
		Queue<TreeNode> subQueue = new LinkedList<TreeNode>();
		double total = 0;
		int count = 0;
		currentQueue.add(root);
		
		while(!currentQueue.isEmpty()) {
			TreeNode x = currentQueue.poll();
			if(x != null) {
				total += (x.val);
				count += 1;
				if(x.left!=null)
					subQueue.add(x.left);
				if(x.right!=null)
					subQueue.add(x.right);
				if(currentQueue.isEmpty()) {
					list.add(total/count);
					total = 0;
					count = 0;
					Queue<TreeNode> temp = new LinkedList<TreeNode>();
					temp = currentQueue;
					currentQueue = subQueue;
					subQueue = temp;
				}	
			}
		}
		return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.print(averageOfLevels(b.root));
	}

}
