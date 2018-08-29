/**
* @project_name GitHub
* @author quent
* @date 2018��8��28��
* @time ����5:21:31
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *����һ���������飬�ҳ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ����Ķ���֮һ��
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
