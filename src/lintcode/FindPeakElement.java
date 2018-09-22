/**
* @project_name coding
* @author quent
* @date 2018年9月23日
* @time 上午7:26:28
*/
package lintcode;

/**
 * @author quent
 *
 */
public class FindPeakElement {

	public int findPeak(int[] A) {
        // write your code here
		//超时了
		int p=0;
		if (A==null || A.length==0) {
			return p;
		}
		for(int i=1;i<=A.length-2;i++) {
			if (A[i]>A[i-1] && A[i]>A[i+1]) {
				p=i;
			}
		}
		return p;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindPeakElement findPeakElement=new FindPeakElement();
		int[] A= {1,2,1,3,4,5,7,6};
		System.out.println(findPeakElement.findPeak(A));
	}

}
