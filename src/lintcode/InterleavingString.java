/**
* @project_name leetcode
* @author quent
* @date 2018年8月19日
* @time 下午3:07:06
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
		if (s1.length()+s2.length()!=s3.length()) {
			return false;
		}
		boolean[][] dp=new boolean[s2.length()+1][s1.length()+1];
		dp[0][0]=true;
		for (int i = 1; i < s1.length(); i++) {
			dp[0][i]=dp[0][i-1]&&(s1.charAt(i-1)==s3.charAt(i-1));
		}
		for (int j = 1; j < s2.length(); j++) {
			dp[j][0]=dp[j-1][0]&&(s2.charAt(j-1)==s3.charAt(j-1));
		}
		for (int k = 1; k < s2.length(); k++) {
			for (int l = 1; l < s1.length(); l++) {
				dp[k][l]=dp[k-1][l]&&(s2.charAt(k-1)==s3.charAt(l+k-1))||dp[k][l-1]&&(s1.charAt(l-1)==s3.charAt(l+k-1));
			}
		}
		return dp[s2.length()][s1.length()];
	}
	public static void main(String[] args) {
		InterleavingString interleavingString = new InterleavingString();
		String s1="aabcc";
		String s2="dbbca";
		String s3="aadbbcbcac";
		System.out.println(interleavingString.isInterleave(s1, s2, s3));
	}
}
