package lintcode;

import java.util.ArrayList;
import java.util.List;

public class RecoverRotatedSortedArray {

	public void recoverRotatedSortedArray(List<Integer> nums) {
//        for(int i=0;i<nums.size()-1;i++) {
//        	if (nums.get(i)>nums.get(i+1)) {
//				int tmp;
//				tmp = nums.get(i);
//				nums.set(i, nums.get(i+1));
//				nums.set(i+1, tmp);
//			}
//        }
//		for(int i=0;i<nums.size()-1;i++) {
//			for(int j=1;j<nums.size()-2;j++) {
//				if (nums.get(i)<nums.get(j)) {
//					int tmp;
//					tmp=nums.get(i);
//					nums.set(i, nums.get(j));
//					nums.set(j, tmp);
//				}
//			}
//		}
		int k = 0;
        int len = nums.size();
        for(int i = 1; i < len; i++){
            if(nums.get(i - 1) > nums.get(i)){
                reverse(nums, 0, i - 1);
                reverse(nums, i, len - 1);
                reverse(nums, 0, len - 1);
                break;
            }
        }
    }
    
    private void reverse(List<Integer> nums, int start, int end){
        while(start < end){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }
	
	public static void main(String[] args) {
		RecoverRotatedSortedArray recoverRotatedSortedArray=new RecoverRotatedSortedArray();
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(4);
		nums.add(5);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		recoverRotatedSortedArray.recoverRotatedSortedArray(nums);
	}

}
