package lintcode;

/*
 * 描述
给出一个整数数组 nums 和一个整数 k。划分数组（即移动数组 nums 中的元素），使得：

所有小于k的元素移到左边
所有大于等于k的元素移到右边
返回数组划分的位置，即数组中第一个位置 i，满足 nums[i] 大于等于 k。
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
