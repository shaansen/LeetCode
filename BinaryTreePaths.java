import java.util.*;

public class BinaryTreePaths {
	
	public static List<String> list;
	
	public static void handler(TreeNode root, String s) {
		if(root == null) {
			return;
		}
		
		s += "->"+root.val;
		if(root.left == null && root.right == null) {
			list.add(s.substring(2));
			return;
		}
		handler(root.left, s);
		handler(root.right, s);
	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
        list = new LinkedList<String>();
        handler(root, "");
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
