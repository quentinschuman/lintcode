/**
* @project_name coding
* @author quent
* @date 2018年9月24日
* @time 上午7:08:03
*/
package lintcode;

/**
 * @author quent
 *
 */
public class LongestIncreasingSubsequence {

	public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
		int[] maxlen=new int[nums.length];
		int max=0;
		for(int i=0;i<nums.length;i++) {
			maxlen[i]=1;
			for(int j=0;j<i;j++) {
				if (nums[j]<nums[i]) {
					maxlen[i]=maxlen[i]>maxlen[j]+1?maxlen[i]:maxlen[j]+1;
				}
			}
			if (maxlen[i]>max) {
				max=maxlen[i];
			}
		}
		return max;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestIncreasingSubsequence longestIncreasingSubsequence=new LongestIncreasingSubsequence();
		int[] nums= {4, 2, 4, 5, 3, 7};
		System.out.println(longestIncreasingSubsequence.longestIncreasingSubsequence(nums));
	}

}
