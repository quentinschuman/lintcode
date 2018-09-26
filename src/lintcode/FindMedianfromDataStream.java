/**
* @project_name coding
* @author quent
* @date 2018年9月26日
* @time 上午7:26:28
*/
package lintcode;

import java.util.Arrays;

/**
 * @author quent
 *
 */
public class FindMedianfromDataStream {

	public int[] medianII(int[] nums) {
        // write your code here
		int[] newNums=new int[nums.length];
		int[] res=new int[nums.length];
		if (nums==null || nums.length==0) {
			return nums;
		}
		for(int i=0;i<nums.length;i++) {
			newNums[i]=nums[i];
			res[i]=findMedian(newNums);
		}
		return res;
    }
	
	/**
	 * @param object
	 */
	private int findMedian(int[] newNums) {
		Arrays.sort(newNums);
		if (newNums.length%2==0) {
			return newNums[newNums.length/2-1];
		}else {
			return newNums[newNums.length/2];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMedianfromDataStream findMedianfromDataStream=new FindMedianfromDataStream();
		int[] nums= {1,2,3,4,5};
		System.out.println(findMedianfromDataStream.medianII(nums));
	}

}
