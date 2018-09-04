/**
* @project_name GitHub
* @author quent
* @date 2018年8月30日
* @time 下午4:49:57
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class PreviousPermutation {

	public List<Integer> previousPermuation(List<Integer> nums) {
        int peakInd=nums.size()-1;
        while(peakInd>0 &&nums.get(peakInd-1)<=nums.get(peakInd)) {
        	peakInd--;
        }
        peakInd--;
        if (peakInd>=0) {
			int swapInd=peakInd+1;
			while(swapInd<nums.size() && nums.get(swapInd)<nums.get(peakInd)) {
				swapInd++;
			}
			swapInd--;
			int tmp=nums.get(swapInd);
			nums.set(swapInd, nums.get(peakInd));
			nums.set(peakInd, tmp);
		}
        int left=peakInd+1;
        int right=nums.size()-1;
        while(left<right) {
        	int tmp=nums.get(left);
        	nums.set(left, nums.get(right));
        	nums.set(right, tmp);
        	left++;
        	right--;
        }
        return nums;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PreviousPermutation previousPermutation = new PreviousPermutation();
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println(previousPermutation.previousPermuation(nums));
	}

}
