
public class SubtreeofAnotherTree {
	
	public static boolean sameTree(TreeNode s, TreeNode t) {
		if(s==null && t==null) {
			return true;
		} else if(s==null || t==null) {
			return false;
		} else {
			return s.val==t.val && sameTree(s.left, t.left) && sameTree(s.right , t.right);
		}
	}
	
	public static boolean isSubtree(TreeNode s, TreeNode t) {
        Boolean result = sameTree(s, t);
        Boolean result_l = s.left == null ? false : isSubtree(s.left, t);
        Boolean result_r = s.right == null ? false : isSubtree(s.right, t);
        return result || result_l || result_r;
    }

	public static void main(String[] args) {

	}

}
