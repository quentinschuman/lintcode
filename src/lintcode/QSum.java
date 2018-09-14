/**
* @project_name GitHub
* @author quent
* @date 2018年9月12日
* @time 上午7:54:33
*/
package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author quent
 *
 */
public class QSum {

	public List<List<Integer>> fourSum(int[] numbers, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if (numbers==null || numbers.length<4) {
			return res;
		}
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-3;i++) {
        	if (i>0 && numbers[i]==numbers[i-1]) {
				continue;
			}
        	int sum3=target-numbers[i];// 后3个数之和需等于sum3
        	for(int j=i+1;j<numbers.length-2;j++) {
        		if (j>i+1 && numbers[j]==numbers[j-1]) {
					continue;
				}
        		int sum2=sum3-numbers[j];// 后2个数之和需等于sum2
        		int left=j+1;
        		int right=numbers.length-1;
        		while(left<right) {
        			if (numbers[left]+numbers[right]==sum2) {
						List<Integer> res1=new ArrayList<>();
						res1.add(numbers[i]);
						res1.add(numbers[j]);
						res1.add(numbers[left]);
						res1.add(numbers[right]);
						res.add(res1);
						while(left<right && numbers[left++]==numbers[left]) {}
						while(left<right && numbers[right--]==numbers[right]) {}
					}else if (numbers[left]+numbers[right]<sum2) {
						while(left<right && numbers[left++]==numbers[left]) {}
					}else {
						while(left<right && numbers[right--]==numbers[right]) {}
					}
        		}
        	}
        }
        return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QSum qSum=new QSum();
		int[] numbers= {1,0,-1,0,-2,2};
		int target=0;
		System.out.println(qSum.fourSum(numbers, target));
	}

}
