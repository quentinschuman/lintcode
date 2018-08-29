/**
* @project_name GitHub
* @author quent
* @date 2018年8月28日
* @time 下午5:21:31
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 */
public class MajorityElement {

	public int majorityNumber(List<Integer> nums) {
		//sort
//		nums.sort(null);
//		int result=0;
//		for(int i=(nums.size()/2)-1;i<nums.size()/2;i++) {
//			if (nums.size()==1) {
//				result=nums.get(0);
//			}else if (nums.get(i)==nums.get(i+1)) {
//				result=nums.get(i);
//			}else {
//				result=nums.get(nums.size()-1);
//			}
//		}
//		return result;
		int element=0;
		int count=0;
		for (int i = 0; i < nums.size(); i++) {
			if (count==0) {
				element=nums.get(i);
				count=1;
			}else if (element==nums.get(i)) {
				count++;
			}else {
				count--;
			}
		}
		return element;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MajorityElement majorityElement = new MajorityElement();
		List<Integer> nums = new ArrayList<>();
		nums.add(0);
		System.out.println(majorityElement.majorityNumber(nums));
	}

}
