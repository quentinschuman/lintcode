/**
* @project_name coding
* @author quent
* @date 2018年9月26日
* @time 下午8:31:52
*/
package lintcode;

import java.util.Arrays;

/**
 * @author quent
 *
 */
public class SingleNumberII {

	public int singleNumberII(int[] A) {
		// write your code here
		int res = 0;
		if (A == null || A.length == 0) {
			return res;
		}
		if (A.length == 1) {
			res = A[0];
		}
		if (A.length > 1) {
			Arrays.sort(A);
			// 判断头
			if (A[0] != A[1]) {
				res = A[0];
			}
			// 判断中间,如果在中间，那一定在3*n+1的位置上
			for (int i = 1; i < A.length / 3; i++) {
				if (A[3 * i + 1] != A[3 * i] && A[3 * i + 1] != A[3 * i + 2]) {
					res = A[3 * i + 1];
				}
			}
			// 判断尾
			if (A[A.length - 2] != A[A.length - 1]) {
				res = A[A.length - 1];
			}
		}
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleNumberII singleNumberII = new SingleNumberII();
		int[] A = { 1 };
		System.out.println(singleNumberII.singleNumberII(A));
	}

}
