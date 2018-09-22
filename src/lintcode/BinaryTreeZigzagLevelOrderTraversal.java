/**
* @project_name coding
* @author quent
* @date 2018年9月22日
* @time 上午7:13:34
*/
package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author quent
 *
 */
public class BinaryTreeZigzagLevelOrderTraversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
		List<List<Integer>> res=new ArrayList<>();
		if (root==null) {
			return res;
		}
		LinkedList<TreeNode> stack=new LinkedList<>();
		int level=1;
		ArrayList<Integer> item=new ArrayList<>();
		item.add(root.val);
		res.add(item);
		stack.push(root);
		while(!stack.isEmpty()) {
			LinkedList<TreeNode> newStack=new LinkedList<>();
			item=new ArrayList<>();
			while(!stack.isEmpty()) {
				TreeNode node=stack.pop();
				if (level%2==0) {
					if (node.left!=null) {
						newStack.push(node.left);
						item.add(node.left.val);
					}
					if (node.right!=null) {
						newStack.push(node.right);
						item.add(node.right.val);
					}
				}else {
					if (node.right!=null) {
						newStack.push(node.right);
						item.add(node.right.val);
					}
					if (node.left!=null) {
						newStack.push(node.left);
						item.add(node.left.val);
					}
				}
			}
			level++;
			if (item.size()>0) {
				res.add(item);
			}
			stack=newStack;
		}
		return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(9);
		TreeNode right=new TreeNode(20);
		TreeNode left1=new TreeNode(15);
		TreeNode right1=new TreeNode(7);
		root.right=right;
		root.left=left;
		right.right=right1;
		right.left=left1;
		BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal=new BinaryTreeZigzagLevelOrderTraversal();
		System.out.println(binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root));
	}

}
