/**
* @project_name GitHub
* @author quent
* @date 2018��8��29��
* @time ����5:09:43
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *���������������ִ�������n/3�������������޶���ʱ��Ϳռ临�Ӷȣ���ô�Ͳ�������Ҳ����ʹ�ù�ϣ��
 *��ô���̵���������ֻ��һ�ַ����ܽ��ˣ��Ǿ���Ħ��ͶƱ�� Moore Voting��
 *���ַ�����֮ǰ�ǵ���Majority Element ��������Ҳʹ���ˡ���Ŀ�и���һ������Ҫ����ʾ��
 *�������ȿ��ǿ��ܻ��ж��ٸ��������������˺ܶ����ӷ����ó�������һ��������ִ�������n/3�����������������
 *�����֤���ҾͲ����ˣ���Ҳ������ѧרҵ�ġ���ô���������Ϣ������ʹ��ͶƱ���ĺ������ҳ�������ѡ��������ͶƱ��
 *��Ҫ�����������һ�����ҳ�������ѡ�������ڶ����������ͶƱ��֤��������ѡ�����Ƿ�Ϊ�������ɣ�
 *ѡ��ѡ����������ǰ����ƪMajority Element ������һ��������֮ǰ������Ŀ���޶���һ�������������ڣ�
 *�ʶ�ʡ������֤��ѡ�����Ĳ��裬�����ȴû�������޶���������Ҫ����������ܲ����ڣ�����Ҫ����֤��
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
