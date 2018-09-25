/**
* @project_name coding
* @author quent
* @date 2018年9月25日
* @time 上午7:32:44
*/
package lintcode;

/**
 * @author quent
 *
 */
public class LongestCommonSubstring {

	public int longestCommonSubstring(String A, String B) {
        // write your code here
		int res=0;
		if (A==null || B==null || A.length()==0 || B.length()==0) {
			return 0;
		}
		for(int i=0;i<A.length();i++) {
			for(int j=0;j<B.length();j++) {
				int current=0;
				while(i+current<A.length() && j+current<B.length() && A.charAt(i+current)==B.charAt(j+current)) {
					current++;
					res=Math.max(res, current);
				}
			}
		}
		return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestCommonSubstring longestCommonSubstring=new LongestCommonSubstring();
		String A= "ABCD";
		String B= "CBCE";
		System.out.println(longestCommonSubstring.longestCommonSubstring(A, B));
	}

}
