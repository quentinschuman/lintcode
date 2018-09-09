/**
* @project_name GitHub
* @author quent
* @date 2018年9月9日
* @time 下午8:36:25
*/
package lintcode;

/**
 * @author quent
 *
 */
public class NextPermutation {

	public int[] nextPermutation(int[] nums) {
		if (nums == null || nums.length == 0 || nums.length == 1) {
			return nums;
		}
		// 从右边开始找前一位比当前位小的数
		int len = nums.length;
		int i = len - 1;
		for (; i > 0; i--) {
			if (i > 0 && nums[i] > nums[i - 1]) {
				break;
			}
		}
		// 因为需要找下一个大的数，所以从右向左，找到第一个刚刚比 i-1 位置大的那个数
		if (i > 0) {
			int j = len - 1;
			for (; j > i - 1; j--) {
				if (nums[j] > nums[i - 1]) {
					break;
				}
			}
			// 交换 i-1 j
			int temp = nums[i - 1];
			nums[i - 1] = nums[j];
			nums[j] = temp;
		}

		// 逆转 i-1 后面的数组
		int pre = i, last = len - 1;
		while (pre < last) {
			int temp = nums[pre];
			nums[pre] = nums[last];
			nums[last] = temp;
			pre++;
			last--;
		}
		return nums;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NextPermutation nextPermutation = new NextPermutation();
		int[] nums = { 1, 3, 2, 3 };
		System.out.println(nextPermutation.nextPermutation(nums));
	}
}
