import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

	static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> subList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> substack = new Stack<TreeNode>();
        stack.push(root);
        subList.add(root.val);
        list.add(subList);
        
        int ind = 0;
        
        while(!stack.isEmpty()) {
        	
        	TreeNode x = stack.pop();
        	subList = new ArrayList<Integer>();
        	if(x.left!=null) {
        		substack.add(x.left);
        	}
        	if(x.right!=null) {
        		substack.add(x.right);
        	}
        	
        	if(stack.isEmpty()) {
        		Stack<TreeNode> temp = (Stack<TreeNode>)substack.clone();
        		stack = substack;
        		substack = new Stack<TreeNode>();
        		if(ind == 0 ) {
        			while(!temp.isEmpty()) {
        				TreeNode tempNode = temp.pop();
        				subList.add(tempNode.val);
        			}
        			ind = 1;
        		} else if(ind ==1){
        			while(!temp.isEmpty()) {
        				TreeNode tempNode = temp.pop();
        				subList.add(0,tempNode.val);
        			}
        			ind = 0;
        		}
        		
        		if(!subList.isEmpty())
        			list.add(subList);
        	}     		
        }
        return list;
    }
		
	public static void main(String[] args) {
		
		BinaryTree b = new BinaryTree();
		b.root = new TreeNode(3);
		b.root.left = new TreeNode(9);
		b.root.right = new TreeNode(20);
		b.root.right.left = new TreeNode(15);
		b.root.right.right = new TreeNode(7);
		b.root.left.left = new TreeNode(20);
		b.root.left.right = new TreeNode(37);
		System.out.println(zigzagLevelOrder(b.root));
	}

}
