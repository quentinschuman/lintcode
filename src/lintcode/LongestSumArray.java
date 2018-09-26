/**
* @project_name coding
* @author quent
* @date 2018年9月25日
* @time 下午7:26:49
*/
package lintcode;

/**
 * @author quent
 *
 */
public class LongestSumArray {

	public int longestSumArray(int[] nums) {
		if (nums==null || nums.length==0) {
			return 0;
		}
		int sum=0,maxSum=0;
		for(int i=0;i<nums.length;i++) {
			sum=0;
			for(int j=i;j<nums.length-1;j++) {
				sum+=nums[j];
				if (sum>maxSum) {
				maxSum=sum;
				}
			}
		}
		return maxSum;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestSumArray longestSumArray=new LongestSumArray();
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(longestSumArray.longestSumArray(nums));
	}

}
