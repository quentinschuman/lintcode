/**
* @project_name GitHub
* @author quent
* @date 2018��9��9��
* @time ����8:36:25
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
		// ���ұ߿�ʼ��ǰһλ�ȵ�ǰλС����
		int len = nums.length;
		int i = len - 1;
		for (; i > 0; i--) {
			if (i > 0 && nums[i] > nums[i - 1]) {
				break;
			}
		}
		// ��Ϊ��Ҫ����һ������������Դ��������ҵ���һ���ոձ� i-1 λ�ô���Ǹ���
		if (i > 0) {
			int j = len - 1;
			for (; j > i - 1; j--) {
				if (nums[j] > nums[i - 1]) {
					break;
				}
			}
			// ���� i-1 j
			int temp = nums[i - 1];
			nums[i - 1] = nums[j];
			nums[j] = temp;
		}

		// ��ת i-1 ���������
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
