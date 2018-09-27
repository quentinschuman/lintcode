/**
* @project_name coding
* @author quent
* @date 2018年9月27日
* @time 上午7:35:06
*/
package lintcode;

/**
 * @author quent
 *
 */
public class InsertNodeinaBinarySearchTree {

	public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
		//递归
		if (root==null) {
			return node;
		}
		if (root.val>node.val) {
			root.left=insertNode(root.left, node);
		}else {
			root.right=insertNode(root.right, node);
		}
		return root;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
