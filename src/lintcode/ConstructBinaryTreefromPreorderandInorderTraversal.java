/**
* @project_name coding
* @author quent
* @date 2018年9月22日
* @time 上午10:28:30
*/
package lintcode;

import java.util.HashMap;

/**
 * @author quent
 *
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
		if (preorder==null || inorder==null || preorder.length==0 || inorder.length==0) {
			return null;
		}
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<inorder.length;i++) {
			map.put(inorder[i], i);
		}
		return helper(inorder,preorder,0,inorder.length-1,0,preorder.length-1,map);
    }
	
	/**
	 * @param inorder
	 * @param preorder
	 * @param i
	 * @param j
	 * @param k
	 * @param l
	 * @param map
	 * @return
	 */
	private TreeNode helper(int[] inorder, int[] preorder, int inL, int inR, int preL, int preR, HashMap<Integer, Integer> map) {
		if (inL>inR || preL>preR) {
			return null;
		}
		TreeNode root=new TreeNode(preorder[preL]);
		int index=map.get(root.val);
		root.left=helper(inorder, preorder, inL, index-1, preL+1, preL+index-inL, map);
		root.right=helper(inorder, preorder, index+1, inR, preL+index-inL+1, preR, map);
		return root;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConstructBinaryTreefromPreorderandInorderTraversal constructBinaryTreefromPreorderandInorderTraversal=new ConstructBinaryTreefromPreorderandInorderTraversal();
		int[] inorder= {1,2,3};
		int[] preorder= {2,1,3};
		System.out.println(constructBinaryTreefromPreorderandInorderTraversal.buildTree(preorder, inorder));
	}

}
