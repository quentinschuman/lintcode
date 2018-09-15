/**
* @project_name coding
* @author quent
* @date 2018年9月15日
* @time 下午9:02:29
*/
package lintcode;

/**
 * @author quent
 *
 */
public class MergeSortedArray {

	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
		int i=m-1,j=n-1,k=m+n-1;
		while(k>=0) {
			if (i>=0 && j>=0 && A[i]>=B[j]) {
				A[k]=A[i];
				i--;
			}else if (i>=0 && j>=0 && A[i]<B[j]) {
				A[k]=B[j];
				j--;
			}else if (i<0 && j>=0) {
				A[k]=B[j];
				j--;
			}else {
				return;
			}
			k--;
		}
		return;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSortedArray mergeSortedArray=new MergeSortedArray();
		int[] A= {1,2,3};
		int[] B= {4,5};
		int m=2;
		int n=1;
		mergeSortedArray.mergeSortedArray(A, m, B, n);
		System.out.println(A);
		System.out.println(B);
	}

}
