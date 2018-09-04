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
 *这道题让我们求出现次数大于n/3的众数，而且限定了时间和空间复杂度，那么就不能排序，也不能使用哈希表，
 *这么苛刻的限制条件只有一种方法能解了，那就是摩尔投票法 Moore Voting，
 *这种方法在之前那道题Majority Element 求众数中也使用了。题目中给了一条很重要的提示，
 *让我们先考虑可能会有多少个众数，经过举了很多例子分析得出，任意一个数组出现次数大于n/3的众数最多有两个，
 *具体的证明我就不会了，我也不是数学专业的。那么有了这个信息，我们使用投票法的核心是找出两个候选众数进行投票，
 *需要两遍遍历，第一遍历找出两个候选众数，第二遍遍历重新投票验证这两个候选众数是否为众数即可，
 *选候选众数方法和前面那篇Majority Element 求众数一样，由于之前那题题目中限定了一定会有众数存在，
 *故而省略了验证候选众数的步骤，这道题却没有这种限定，即满足要求的众数可能不存在，所以要有验证。
 */
public class MajorityElementII {

	public int majorityNumber(List<Integer> nums) {
//        nums.sort(null);
//        int result=0;
//        for(int i=(nums.size()/3)-1;i<=nums.size()/3;i++) {
//        	if (nums.size()==1 || nums.size()==2) {
//				result=nums.get(0);
//			}else if (nums.get(i)==nums.get(i+1)) {
//				result=nums.get(i);
//			}
//			else {
//				result=nums.get(nums.size()-1);
//			}
//        }
//        return result;
		int res=0;
		if (nums==null||nums.size()==0) {
			return res;
		}
		if (nums.size()==1) {
			res=nums.get(0);
			return res;
		}
		int m1=nums.get(0);
		int m2=0;
		int c1=1;
		int c2=0;
		for(int i=1;i<nums.size();i++) {
			int x=nums.get(i);
			if (x==m1) {
				++c1;
			}else if(x==m2) {
				++c2;
			}else if(c1==0) {
				m1=x;
				c1=1;
			}else if(c2==0) {
				m2=x;
				c2=1;
			}else {
				--c1;
				--c2;
			}
		}
		c1=0;c2=0;
		for(int i=0;i<nums.size();i++) {
			if (m1==nums.get(i)) {
				++c1;
			}else if(m2==nums.get(i)) {
				++c2;
			}
			if (c1>nums.size()/3) {
				res=nums.get(m2);
			}
			if (c2>nums.size()/3) {
				res=nums.get(m1);
			}
		}
		return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MajorityElementII majorityElementII=new MajorityElementII();
		List<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(1);
		nums.add(2);
		nums.add(1);
		nums.add(3);
		nums.add(3);
		System.out.println(majorityElementII.majorityNumber(nums));
	}

}
