/**
* @project_name coding
* @author quent
* @date 2018��9��27��
* @time ����7:35:06
*/
package lintcode;

/**
 * @author quent
 *
 */
public class InsertNodeinaBinarySearchTree {

	public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
		//�ݹ�
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
