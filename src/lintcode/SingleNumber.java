/**
* @project_name coding
* @author quent
* @date 2018年9月26日
* @time 上午8:31:49
*/
package lintcode;

import java.util.Arrays;

/**
 * @author quent
 *
 */
public class SingleNumber {

	public int singleNumber(int[] A) {
        // write your code here
		int res=0;
		if (A==null || A.length==0) {
			return res;
		}
		if (A.length==1) {
			res=A[0];
		}
		Arrays.sort(A);
		for(int i=1;i<A.length-1;i++) {
			//判断头
			if (A[0]!=A[1]) {
				res=A[0];
			}
			//除了头和尾
			if (A[i-1]!=A[i] && A[i]!=A[i+1]) {
				res=A[i];
			}
			//判断尾
			if (A[A.length-2]!=A[A.length-1]) {
				res=A[A.length-1];
			}
		}
		return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleNumber singleNumber=new SingleNumber();
		int[] A= {1,2,2,1,3,4,3};
		System.out.println(singleNumber.singleNumber(A));
	}

}
