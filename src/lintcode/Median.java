/**
* @project_name coding
* @author quent
* @date 2018年9月26日
* @time 上午7:06:16
*/
package lintcode;

import java.util.Arrays;

/**
 * @author quent
 *
 */
public class Median {

	public int median(int[] nums) {
        // write your code here
		if (nums==null || nums.length==0) {
			return 0;
		}
		Arrays.sort(nums);
		if (nums.length%2==0) {
			return nums[nums.length/2-1];
		}else {
			return nums[nums.length/2];
		}
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Median median=new Median();
		int[] nums= {7,9,4,5};
		System.out.println(median.median(nums));
	}

}
