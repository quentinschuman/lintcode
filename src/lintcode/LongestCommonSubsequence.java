/**
* @project_name coding
* @author quent
* @date 2018年9月24日
* @time 上午7:33:34
*/
package lintcode;

/**
 * @author quent
 *
 */
public class LongestCommonSubsequence {

	public int longestCommonSubsequence(String A, String B) {
        // write your code here
		//from jiuzhangsuanfa
		int n=A.length();
		int m=B.length();
		int f[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				f[i][j]=Math.max(f[i-1][j], f[i][j-1]);
				if (A.charAt(i-1)==B.charAt(j-1)) {
					f[i][j]=f[i-1][j-1]+1;
				}
			}
		}
		return f[n][m];
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestCommonSubsequence longestCommonSubsequence=new LongestCommonSubsequence();
		String A="ABCD";
		String B="EACB";
		System.out.println(longestCommonSubsequence.longestCommonSubsequence(A, B));
	}

}
