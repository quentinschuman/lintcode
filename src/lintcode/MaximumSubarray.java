package lintcode;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
//		int result = 0;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j=1; j < nums.length - 1; j++) {
//				result = nums[i];
//				if (nums[i] + nums[j] > result) {
//					result = nums[i] + nums[j];
//				}
//			}
//		}
//		return result;
		int res = Integer.MIN_VALUE, curSum = 0;
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            res = Math.max(res, curSum);
        }
        return res;
	}

	public static void main(String[] args) {
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		int[] nums = { -2, 2, -3, 4, -1, 2, 1, -5, 3 };
		System.out.println(maximumSubarray.maxSubArray(nums));
	}

}
