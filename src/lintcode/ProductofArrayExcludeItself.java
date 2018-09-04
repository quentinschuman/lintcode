/**
* @project_name GitHub
* @author quent
* @date 2018年8月30日
* @time 下午2:45:17
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class ProductofArrayExcludeItself {

	public List<Long> productExcludeItself(List<Integer> nums) {
		List<Long> result = new ArrayList<>();
		if (nums.size() <= 1) {
			result.add((long)1);
		}else if (nums.size() > 1) {
			long[] left=new long[nums.size()];
			long[] right=new long[nums.size()];
			left[0]=1;
			for(int i=1;i<nums.size();i++) {
				left[i]=left[i-1]*nums.get(i-1);
			}
			right[nums.size()-1]=1;
			for(int j=nums.size()-2;j>=0;j--) {
				right[j]=right[j+1]*nums.get(j+1);
			}
			for(int k=0;k<nums.size();k++) {
				result.add(left[k]*right[k]);
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductofArrayExcludeItself productofArrayExcludeItself = new ProductofArrayExcludeItself();
		List<Integer> nums = new ArrayList<>();
		nums.add(0);
//		nums.add(2);
//		nums.add(3);
		System.out.println(productofArrayExcludeItself.productExcludeItself(nums));
	}

}
