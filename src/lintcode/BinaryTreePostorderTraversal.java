/**
* @project_name coding
* @author quent
* @date 2018年9月19日
* @time 上午10:48:02
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class BinaryTreePostorderTraversal {

	List<Integer> res=new ArrayList<>();
	public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
		if (root==null) {
			return res;
		}
		postOrder(root);
		return res;
    }
	
	/**
	 * @param root
	 */
	private void postOrder(TreeNode root) {
		if (root.left!=null) {
			postOrder(root.left);
		}
		if (root.right!=null) {
			postOrder(root.right);
		}
		res.add(root.val);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode left=null;
		TreeNode right=new TreeNode(2);
		TreeNode left1=new TreeNode(3);
		TreeNode right1=null;
		root.right=right;
		root.left=left;
		right.right=right1;
		right.left=left1;
		BinaryTreePostorderTraversal binaryTreePostorderTraversal=new BinaryTreePostorderTraversal();
		System.out.println(binaryTreePostorderTraversal.postorderTraversal(root));
	}

}
