/**
* @project_name leetcode
* @author quent
* @date 2018年8月14日
* @time 下午9:55:12
*/
package leetcode;

/**
 * @author quent
 *
 */
public class WordPattern {

	public boolean wordPattern(String pattern, String str) {
		for (int i = 0; i < pattern.length(); i++) {
			for (int j = i + 1; j < pattern.length() + 1; j++) {
				if (pattern.substring(i, i + 1).toString() == pattern.substring(j, j + 1).toString()) {
//					String str1=
				}
			}
		}
		return false;
	}
	
//	public String[] findSpace(String str) {
//		String s[]=null;
//		int k;
//		for(int m=0;m<str.length();m++) {
//			for(int n=m+1;n<str.length()+1;n++) {
//				if(s[m]!=" ") {
////					s[k]
//				}
//			}
//		}
//	}

	public static void main(String[] args) {

	}
}
