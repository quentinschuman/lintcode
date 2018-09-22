/**
* @project_name coding
* @author quent
* @date 2018年9月22日
* @time 上午10:49:44
*/
package lintcode;

/**
 * @author quent
 *
 */
public class FirstBadVersion {

	public int findFirstBadVersion(int n) {
        // write your code here
		if (n<=0) {
			return 0;
		}
		int low=1,high=n;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if (GitRepo.isBadVersion(mid)) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstBadVersion firstBadVersion=new FirstBadVersion();
		int n=5;
		System.out.println(firstBadVersion.findFirstBadVersion(n));
	}

}
