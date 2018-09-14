/**
* @project_name GitHub
* @author quent
* @date 2018年9月13日
* @time 上午9:27:57
*/
package lintcode;

import java.util.Arrays;

/**
 * @author quent
 *
 */
public class TSumClosest {

	public int threeSumClosest(int[] numbers, int target) {
        Arrays.sort(numbers);
        int closestSum=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length-2;i++) {
        	int left=i+1;
        	int right=numbers.length-1;
        	while(left<right) {
        		int tmpSum=numbers[left]+numbers[i]+numbers[right];
        		int tmpDiff=Math.abs(tmpSum-target);
        		if (tmpDiff<diff) {
					closestSum=tmpSum;
					diff=tmpDiff;
				}
        		if (tmpSum<target) {
					left++;
				}else if (tmpSum>target) {
					right--;
				}else {
					return tmpSum;
				}
        	}
        }
        return closestSum;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TSumClosest tSumClosest=new TSumClosest();
		int[] numbers= {-1,2,1,4};
		int target=1;
		System.out.println(tSumClosest.threeSumClosest(numbers, target));
	}

}
