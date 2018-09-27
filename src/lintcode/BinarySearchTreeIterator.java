/**
* @project_name coding
* @author quent
* @date 2018年9月28日
* @time 上午7:10:06
*/
package lintcode;

import java.util.Stack;

/**
 * @author quent
 *
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class BinarySearchTreeIterator {

	Stack<TreeNode> stack=new Stack<>();
	public void BSTIterator(TreeNode root) {
        while(root!=null) {
        	stack.push(root);
        	root=root.left;
        }
    }

    /*
     * @return: True if there has next node, or false
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /*
     * @return: return next node
     */
    public TreeNode next() {
        TreeNode current=stack.peek();
        TreeNode node=current;
        if (node.right==null) {
			node=stack.pop();
			while(!stack.isEmpty() && stack.peek().right==node) {
				node=stack.pop();
			}
		}else {
			node=node.right;
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}
		}
        return current;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
