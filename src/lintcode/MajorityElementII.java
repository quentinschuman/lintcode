/**
* @project_name GitHub
* @author quent
* @date 2018年8月29日
* @time 下午5:09:43
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class MajorityElementII {

	public int majorityNumber(List<Integer> nums) {
        nums.sort(null);
        int result=0;
        for(int i=(nums.size()/3)-1;i<=nums.size()/3;i++) {
        	if (nums.size()==1 || nums.size()==2) {
				result=nums.get(0);
			}else if (nums.get(i)==nums.get(i+1)) {
				result=nums.get(i);
			}
			else {
				result=nums.get(nums.size()-1);
			}
        }
        return result;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MajorityElementII majorityElementII=new MajorityElementII();
		List<Integer> nums=new ArrayList<>();
		nums.add(2);
		nums.add(2);
		nums.add(5);
		nums.add(1);
		System.out.println(majorityElementII.majorityNumber(nums));
	}

}
