/**
* @project_name coding
* @author quent
* @date 2018年10月8日
* @time 下午10:03:28
*/
package lintcode;

/**
 * @author quent
 *
 */
public class LowestCommonAncestorofaBinaryTree {

	TreeNode result = null;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
		// write your code here
		helper(root, A, B);
		return result;
	}

	/**
	 * @param root
	 * @param a
	 * @param b
	 */
	private boolean helper(TreeNode root, TreeNode A, TreeNode B) {
		if (root == null) {
			return false;
		}
		boolean left_re = helper(root.left, A, B);
		boolean right_re = helper(root.right, A, B);
		if (root == A || root == B) {
			if (left_re || right_re || A == B) {
				result = root;
			}
			return true;
		}
		if (left_re && right_re) {
			result = root;
			return true;
		}
		return left_re || right_re;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		TreeNode left1=new TreeNode(5);
		TreeNode right1=new TreeNode(1);
		TreeNode left11=new TreeNode(6);
		TreeNode right11=new TreeNode(2);
		TreeNode left111=new TreeNode(7);
		TreeNode right111=new TreeNode(4);
		TreeNode left1111=new TreeNode(0);
		TreeNode right1111=new TreeNode(8);
		root.left=left1;
		root.right=right1;
		left1.left=left11;
		left1.right=right11;
		right11.left=left111;
		right11.right=right111;
		right1.left=left1111;
		right1.right=right1111;
		TreeNode A=new TreeNode(5);
		TreeNode B=new TreeNode(4);
		LowestCommonAncestorofaBinaryTree lowestCommonAncestorofaBinaryTree=new LowestCommonAncestorofaBinaryTree();
		System.out.println(lowestCommonAncestorofaBinaryTree.lowestCommonAncestor(root, A, B));
	}

}
