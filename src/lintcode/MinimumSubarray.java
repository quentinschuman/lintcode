/**
* @project_name GitHub
* @author quent
* @date 2018年8月26日
* @time 下午9:56:00
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class MinimumSubarray {

	public int minSubArray(List<Integer> nums) {
		int res = Integer.MAX_VALUE, curSum = 0;
        for (int num : nums) {
            curSum = Math.min(curSum + num, num);
            res = Math.min(res, curSum);
        }
        return res;
    }
	
	public static void main(String[] args) {
		MinimumSubarray minimumSubarray = new MinimumSubarray();
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(-1);
		nums.add(-2);
		nums.add(1);
		System.out.println(minimumSubarray.minSubArray(nums));
	}
	
}
