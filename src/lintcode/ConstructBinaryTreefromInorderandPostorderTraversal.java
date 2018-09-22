/**
* @project_name coding
* @author quent
* @date 2018年9月22日
* @time 上午7:39:14
*/
package lintcode;

import java.util.HashMap;

/**
 * @author quent
 *
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
		if (inorder==null || postorder==null || inorder.length==0 || postorder.length==0) {
			return null;
		}
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<inorder.length;i++) {
			map.put(inorder[i], i);
		}
		return helper(inorder,postorder,0,inorder.length-1,0,postorder.length-1,map);
    }
	
	/**
	 * @param inorder
	 * @param postorder
	 * @param i
	 * @param j
	 * @param k
	 * @param l
	 * @param map
	 * @return
	 */
	private TreeNode helper(int[] inorder, int[] postorder, int inL, int inR, int postL, int postR, HashMap<Integer, Integer> map) {
		if (inL>inR || postL>postR) {
			return null;
		}
		TreeNode root=new TreeNode(postorder[postR]);
		int index=map.get(root.val);
		root.left=helper(inorder, postorder, inL, index-1, postL, postL+index-inL-1, map);
		root.right=helper(inorder, postorder, index+1, inR, postR-(inR-index), postR-1, map);
		return root;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConstructBinaryTreefromInorderandPostorderTraversal constructBinaryTreefromInorderandPostorderTraversal=new ConstructBinaryTreefromInorderandPostorderTraversal();
		int[] inorder= {1,2,3};
		int[] postorder= {1,3,2};
		System.out.println(constructBinaryTreefromInorderandPostorderTraversal.buildTree(inorder, postorder));
	}
}
