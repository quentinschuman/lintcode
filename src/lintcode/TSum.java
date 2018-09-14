/**
* @project_name GitHub
* @author quent
* @date 2018年9月12日
* @time 上午7:17:00
*/
package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author quent
 *
 */
public class TSum {

	//暴力解法
	public List<List<Integer>> threeSum(int[] numbers) {
		Arrays.sort(numbers);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int right=numbers.length-1;right>1;right--) {
        	for(int left=0;left<right-1;left++) {
        		for(int i=left+1;i<right;i++) {
        			if (numbers[left]+numbers[i]+numbers[right]==0) {
						List<Integer> tmp=new ArrayList<>();
						tmp.add(numbers[left]);
						tmp.add(numbers[i]);
						tmp.add(numbers[right]);
						res.add(tmp);
						break;
					}
        		}
        		while(left+1<right && numbers[left]==numbers[left+1])
        			left++;
        	}
        	while(right-1>0 && numbers[right]==numbers[right-1])
        		right--;
        }
        return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TSum tSum=new TSum();
		int[] numbers= {-1,0,1,2,-1,-4};
		System.out.println(tSum.threeSum(numbers));
	}

}
