/**
* @project_name leetcode
* @author quent
* @date 2018年8月19日
* @time 上午9:36:23
*/
package leetcode;

import java.util.Iterator;

/**
 * @author quent
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		if (nums.length < 2) {
			return null;
		}
		int[] result = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]+nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}else return null;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(ts.twoSum(nums, target).toString());
	}
}
