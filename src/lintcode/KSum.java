/**
* @project_name coding
* @author quent
* @date 2018年10月11日
* @time 上午7:37:49
*/
package lintcode;

/**
 * @author quent
 *
 */
public class KSum {

	public int kSum(int[] A, int k, int target) {
        // write your code here
		int res=0;
		//考虑k=1的情况
//		if (k==1) {
//			for(int i=0;i<A.length;i++) {
//				if (A[i]==target) {
//					res++;
//				}
//			}
//			return res;
//		}
//		int sum_k_1=0;
//		int sum=target-sum_k_1;
//		if (k>1 && k<A.length) {
//			for(int i=0;i<A.length-1;i++) {
//				for(int j=i+1;j<A.length;j++) {
//					
//				}
//			}
//		}
		//动态规划
		int n=A.length;
		int[][][] f=new int[n+1][k+1][target+1];
		for(int i=0;i<n+1;i++) {
			f[i][0][0]=1;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k && j<=i;j++) {
				for(int t=1;t<=target;t++) {
					f[i][j][t]=0;
					if (t>=A[i-1]) {
						f[i][j][t]=f[i-1][j-1][t-A[i-1]];
					}
					f[i][j][t]+=f[i-1][j][t];
				}
			}
		}
		return f[n][k][target];
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KSum kSum=new KSum();
		int[] A= {1,2,3,4,5};
		System.out.println(kSum.kSum(A, 2, 5));
	}

}
