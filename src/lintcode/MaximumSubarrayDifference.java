/**
* @project_name GitHub
* @author quent
* @date 2018��8��27��
* @time ����1:31:43
*/
package lintcode;

/**
 * @author quent ����һ���������飬�ҳ��������ص���������A��B��ʹ����������͵Ĳ�ľ���ֵ|SUM(A) - SUM(B)|���
 *         ����������Ĳ�ֵ��
 */
public class MaximumSubarrayDifference {

	public int maxDiffSubArrays(int[] nums) {
		// �������������Ϊȡ����ֵ��Ҫô��С�ĸ�����Ҫô��������
		// 1��sum��A����С��sum��B�����
		// 2��sum��A�����sum��B����С
		// int resMaxA = Integer.MIN_VALUE, curSumA = 0;
		// for(int num:nums) {
		// curSumA = Math.max(curSumA+num, num);
		// resMaxA = Math.max(resMaxA, curSumA);
		// }
		// int resMinB = Integer.MAX_VALUE, curSumB = 0;
		// for(int num:nums) {
		// curSumB = Math.min(curSumB+num, num);
		// resMinB = Math.min(resMinB, curSumB);
		// }
		// int resMinA = Integer.MAX_VALUE, curSumC = 0;
		// for(int num:nums) {
		// curSumC = Math.max(curSumC+num, num);
		// resMinA = Math.max(resMinA, curSumC);
		// }
		// int resMaxB = Integer.MIN_VALUE, curSumD = 0;
		// for(int num:nums) {
		// curSumD = Math.min(curSumD+num, num);
		// resMaxB = Math.min(resMaxB, curSumD);
		// }
		// return Math.max(Math.abs(resMinA-resMaxB), Math.abs(resMaxA-resMinB));
		int max = Integer.MIN_VALUE;
		if (nums.length < 2) {
			return 0;
		}
		int n = nums.length;
		int[] leftMax = new int[n], leftMin = new int[n];
		int localMax = 0, localMin = 0;
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			localMax = Math.max(num + localMax, num);
			localMin = Math.min(num + localMin, num);
			if (i == 0) {
				leftMax[i] = localMax;
				leftMin[i] = localMin;
			} else {
				leftMax[i] = Math.max(localMax, leftMax[i - 1]);
				leftMin[i] = Math.min(localMin, leftMin[i - 1]);
			}
		}
		localMax = 0;
		localMin = 0;
		int lastMax = 0, lastMin = 0;
		for (int i = n - 1; i > 0; i--) {
			int num = nums[i];
			localMax = Math.max(num + localMax, num);
			localMin = Math.min(num + localMin, num);
			if (i == n - 1) {
				lastMax = localMax;
				lastMin = localMin;
			} else {
				lastMax = Math.max(localMax, lastMax);
				lastMin = Math.min(localMin, lastMin);
			}
			max = Math.max(Math.max(Math.abs(leftMax[i - 1] - lastMin), Math.abs(lastMax - leftMin[i - 1])), max);
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaximumSubarrayDifference maximumSubarrayDifference = new MaximumSubarrayDifference();
		int[] nums = { 1, 2, -3, 1 };
		System.out.println(maximumSubarrayDifference.maxDiffSubArrays(nums));
	}

}
