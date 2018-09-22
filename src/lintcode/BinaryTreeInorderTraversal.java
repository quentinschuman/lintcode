/**
* @project_name coding
* @author quent
* @date 2018年9月19日
* @time 上午10:36:37
*/
package lintcode;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class BinaryTreeInorderTraversal {

	List<Integer> res=new ArrayList<>();
	public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
		if (root==null) {
			return res;
		}
		inOrder(root);
		return res;
    }
	
	/**
	 * @param root
	 */
	private void inOrder(TreeNode root) {
		if (root.left!=null) {
			inOrder(root.left);
		}
		res.add(root.val);
		if (root.right!=null) {
			inOrder(root.right);
		}
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
		BinaryTreeInorderTraversal binaryTreeInorderTraversal=new BinaryTreeInorderTraversal();
		System.out.println(binaryTreeInorderTraversal.inorderTraversal(root));
	}

}
