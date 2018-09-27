/**
* @project_name coding
* @author quent
* @date 2018年9月28日
* @time 上午7:33:05
*/
package lintcode;

/**
 * @author quent
 *
 */
public class RemoveNodeinBinarySearchTree {

	public TreeNode removeNode(TreeNode root, int value) {
        // write your code here
		TreeNode dummy=new TreeNode(0);
		dummy.left=root;
		TreeNode parent=findNode(dummy,root,value);
		TreeNode node;
		if (parent.left!=null && parent.left.val==value) {
			node=parent.left;
		}else if (parent.right!=null && parent.right.val==value) {
			node=parent.right;
		}else {
			return dummy.left;
		}
		deleteNode(parent,node);
		return dummy.left;
    }
	
	/**
	 * @param parent
	 * @param node
	 */
	private void deleteNode(TreeNode parent, TreeNode node) {
		if (node.right==null) {
			if (parent.left==node) {
				parent.left=node.left;
			}else {
				parent.right=node.left;
			}
		}else {
			TreeNode temp=node.right;
			TreeNode father=node;
			while(temp.left!=null) {
				father=temp;
				temp=temp.left;
			}
			if (father.left==temp) {
				father.left=temp.right;
			}else {
				father.right=temp.right;
			}
			if (parent.left==node) {
				parent.left=temp;
			}else {
				parent.right=temp;
			}
			temp.left=node.left;
			temp.right=node.right;
		}
	}

	/**
	 * @param dummy
	 * @param root
	 * @param value
	 * @return
	 */
	private TreeNode findNode(TreeNode parent, TreeNode node, int value) {
		if (node==null) {
			return parent;
		}
		if (node.val==value) {
			return parent;
		}
		if (value<node.val) {
			return findNode(node, node.left, value);
		}else {
			return findNode(node, node.right, value);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
