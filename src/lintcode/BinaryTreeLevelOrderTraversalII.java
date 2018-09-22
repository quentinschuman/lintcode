/**
* @project_name coding
* @author quent
* @date 2018年9月20日
* @time 上午8:02:47
*/
package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author quent
 *
 */
public class BinaryTreeLevelOrderTraversalII {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
		List<List<Integer>> list=new ArrayList<>();
		LinkedList<TreeNode> queue=new LinkedList<>();
		if (root!=null) {
			queue.offer(root);
//			queue.add(root);
		}
		while(!queue.isEmpty()) {
			int len=queue.size();
			List<Integer> tmpList=new ArrayList<>();
			while(len>0) {
				TreeNode treeNode=queue.poll();
				tmpList.add(treeNode.val);
				if (treeNode.left!=null) {
					queue.offer(treeNode.left);
				}
				if (treeNode.right!=null) {
					queue.offer(treeNode.right);
				}
				len--;
			}
			list.add(tmpList);
		}
		List<List<Integer>> returnList=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			returnList.add(list.get(i));
		}
		return returnList;
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
		BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII=new BinaryTreeLevelOrderTraversalII();
		System.out.println(binaryTreeLevelOrderTraversalII.levelOrderBottom(root));
	}
}
