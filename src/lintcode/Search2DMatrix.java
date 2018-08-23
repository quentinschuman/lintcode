/**
* @project_name leetcode
* @author quent
* @date 2018年8月19日
* @time 下午1:33:10
*/
package lintcode;

/**
 * @author quent
 *
 */
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean flag=false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]==target) {
					return flag=true;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Search2DMatrix search2dMatrix = new Search2DMatrix();
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int target = 20;
		System.out.println(search2dMatrix.searchMatrix(matrix, target));
	}
}
