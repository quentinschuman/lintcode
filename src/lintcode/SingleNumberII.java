/**
* @project_name coding
* @author quent
* @date 2018��9��26��
* @time ����8:31:52
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
			// �ж�ͷ
			if (A[0] != A[1]) {
				res = A[0];
			}
			// �ж��м�,������м䣬��һ����3*n+1��λ����
			for (int i = 1; i < A.length / 3; i++) {
				if (A[3 * i + 1] != A[3 * i] && A[3 * i + 1] != A[3 * i + 2]) {
					res = A[3 * i + 1];
				}
			}
			// �ж�β
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
