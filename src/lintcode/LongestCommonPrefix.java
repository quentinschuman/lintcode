/**
* @project_name coding
* @author quent
* @date 2018年9月25日
* @time 上午7:04:42
*/
package lintcode;

/**
 * @author quent
 *
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
        // write your code here
		//九章算法
		if (strs==null || strs.length==0) {
			return "";
		}
		String prefix=strs[0];
		for(int i=1;i<strs.length;i++) {
			int j=0;
			while(j<strs[i].length() && j<prefix.length() && strs[i].charAt(j)==prefix.charAt(j)) {
				j++;
			}
			if (j==0) {
				return "";
			}
			prefix=prefix.substring(0, j);
		}
		return prefix;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
		String[] strs= {"ABCD","ABEF","ACEF"};
		System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
	}

}
