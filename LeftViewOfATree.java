import java.util.*;

public class LeftViewOfATree {
	
	public static List<Integer> list;
	public static int levelCompleted;
	
	public static int getHeightOfTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(getHeightOfTree(root.left), getHeightOfTree(root.right));
	}
	
	public static void addRightMostNodeToList(TreeNode root, int level, int levelForDecrementing) {
		if(root == null) {
			return;
		}
		
		if(levelForDecrementing == 1 && levelCompleted<level) {
			list.add(root.val);
			levelCompleted++;
			return;
		} else if(levelForDecrementing == 1) {
			return;
		}
		addRightMostNodeToList(root.right, level, levelForDecrementing-1);
		addRightMostNodeToList(root.left,  level, levelForDecrementing-1);
		
	}
	
	public static List<Integer> rightSideView(TreeNode root) {
		list = new LinkedList<Integer>();
		levelCompleted = -1;
		
		int n = getHeightOfTree(root);
		for (int i = 0; i < n; i++) {
			addRightMostNodeToList(root,i,i);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
