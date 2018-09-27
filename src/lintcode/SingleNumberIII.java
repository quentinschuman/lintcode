/**
* @project_name coding
* @author quent
* @date 2018��9��27��
* @time ����7:05:46
*/
package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author quent
 *
 */
public class SingleNumberIII {

	public List<Integer> singleNumberIII(int[] A) {
        // write your code here
		List<Integer> res=new ArrayList<>();
		if (A==null || A.length==0) {
			return res;
		}
		if (A.length==1) {
			res.add(A[0]);
		}
		if (A.length==2) {
			res.add(A[0]);
			res.add(A[1]);
		}
		Arrays.sort(A);
		if(A.length>2) {
			//�ж�ͷ
			if (A[0]!=A[1]) {
				res.add(A[0]);
			}
			//�ж��м�
			for(int i=1;i<A.length-1;i++) {
				if (A[i]!=A[i-1] && A[i]!=A[i+1]) {
					res.add(A[i]);
				}
			}
			//�ж�β
			if (A[A.length-2]!=A[A.length-1]) {
				res.add(A[A.length-1]);
			}
		}
		return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleNumberIII singleNumberIII=new SingleNumberIII();
		int[] A= {1,2,2,3,4,4,5,3};
		System.out.println(singleNumberIII.singleNumberIII(A));
	}

}
