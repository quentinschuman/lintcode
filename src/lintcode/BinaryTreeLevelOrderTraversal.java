/**
* @project_name coding
* @author quent
* @date 2018年9月19日
* @time 下午10:06:35
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
		List<List<Integer>> res=new ArrayList<>();
		if (root!=null) {
			List<Integer> first=new ArrayList<>();
			res.add(first);
			first.add(root.val);
			cengOrder(res,root.left,1);
			cengOrder(res,root.right,1);
		}
		return res;
	}

	/**
	 * @param res
	 * @param left
	 * @param i
	 */
	private void cengOrder(List<List<Integer>> res, TreeNode node, int level) {
		List<Integer> temp=new ArrayList<>();
		if (node!=null) {
			if (res.size()==level) {
				res.add(temp);
			}else {
				temp=res.get(level);
			}
			temp.add(node.val);
			cengOrder(res, node.left, level+1);
			cengOrder(res, node.right, level+1);
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
		BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal=new BinaryTreeLevelOrderTraversal();
		System.out.println(binaryTreeLevelOrderTraversal.levelOrder(root));
	}

}
