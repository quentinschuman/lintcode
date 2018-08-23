package lintcode;

/*
 * ����
����һ���������� nums ��һ������ k���������飨���ƶ����� nums �е�Ԫ�أ���ʹ�ã�

����С��k��Ԫ���Ƶ����
���д��ڵ���k��Ԫ���Ƶ��ұ�
�������黮�ֵ�λ�ã��������е�һ��λ�� i������ nums[i] ���ڵ��� k��
 */

public class PartitionArray {

	public int partitionArray(int[] nums, int k) {
		if (nums.length==0) {
			return 0;
		}
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			while(left<right&&nums[right]>=k)
				right--;
			while(left<right&&nums[left]<k)
				left++;
			if (left<right) {
				int tmp=nums[left];
				nums[left]=nums[right];
				nums[right]=tmp;
			}
		}
		if (left==0&&nums[left]>=k) {
			return right;
		}
		if (right==(nums.length-1)&&nums[left]<k) {
			return right+1;
		}
		return right+1;
    }
	
	public static void main(String[] args) {
		PartitionArray partitionArray=new PartitionArray();
		int[] nums= {3,2,2,1};
		int k=2;
		System.out.println(partitionArray.partitionArray(nums, k));
	}

}
