/**
* @project_name coding
* @author quent
* @date 2018年9月22日
* @time 上午10:51:59
*/
package lintcode;

/**
 * @author quent
 *
 */
public class GitRepo {
	public static boolean isBadVersion(int k) {
		boolean flag;
		if (isBadVersion(k-1)==false && isBadVersion(k)==true) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
	}
}
