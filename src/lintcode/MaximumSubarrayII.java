/**
* @project_name GitHub
* @author quent
* @date 2018年8月24日
* @time 下午7:56:59
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class MaximumSubarrayII {

	public int maxTwoSubArrays(List<Integer> nums) {
        int[] left = new int[nums.size()];
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
			localMax = Math.max(nums.get(i), localMax+nums.get(i));
			globalMax = Math.max(localMax, globalMax);
			left[i] = globalMax;
		}
        localMax = 0;
        globalMax = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        for (int i = nums.size()-1; i >= 0; i--) {
			if (i < nums.size()-1) {
				result = Math.max(result, left[i] + globalMax);
			}
			localMax = Math.max(nums.get(i), localMax+nums.get(i));
			globalMax = Math.max(localMax, globalMax);
		}
        return result;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaximumSubarrayII maximumSubarrayII = new MaximumSubarrayII();
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(3);
		nums.add(-1);
		nums.add(2);
		nums.add(-1);
		nums.add(2);
		System.out.println(maximumSubarrayII.maxTwoSubArrays(nums));
	}

}
