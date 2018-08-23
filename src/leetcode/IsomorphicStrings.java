/**
* @project_name leetcode
* @author quent
* @date 2018年8月15日
* @time 下午10:33:09
*/
package leetcode;

/**
 * @author quent
 *
 */
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				if (t.charAt(i) == t.charAt(i + 1)) {
					i++;
				} else
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsomorphicStrings is = new IsomorphicStrings();
		String s = "egg";
		String t = "addr";
		System.out.println(is.isIsomorphic(s, t));
	}
}
