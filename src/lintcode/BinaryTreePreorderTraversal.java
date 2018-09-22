/**
* @project_name coding
* @author quent
* @date 2018年9月18日
* @time 上午7:26:36
*/
package lintcode;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class BinaryTreePreorderTraversal {
	List<Integer> res=new ArrayList<>();
	public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
		//use recursion
		
		if (root==null) {
			return res;
		}
		preOrder(root);
		return res;
    }
	
	/**
	 * @param root
	 */
	private void preOrder(TreeNode root) {
		res.add(root.val);
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreePreorderTraversal binaryTreePreorderTraversal=new BinaryTreePreorderTraversal();
		TreeNode root=new TreeNode(1);
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(3);
		TreeNode left1=new TreeNode(4);
		TreeNode right1=new TreeNode(5);
//		TreeNode left2=new TreeNode(6);
//		TreeNode right2=new TreeNode(7);
		root.left=left;
		root.right=right;
		left.left=left1;
		left.right=right1;
//		right.left=left2;
//		right.right=right2;
		System.out.println(binaryTreePreorderTraversal.preorderTraversal(root));
	}

}
