/**
* @project_name GitHub
* @author quent
* @date 2018年9月11日
* @time 上午7:47:32
*/
package lintcode;

/**
 * @author quent
 *
 */
public class TwoSum {

	//dai you hua
	public int[] twoSum(int[] numbers, int target) {
		int[] res=new int[2];
        for(int i=0;i<numbers.length;i++) {
        	for(int j=i+1;j<=numbers.length-1;j++) {
        		if (numbers[i]+numbers[j]==target) {
					res[0]=i;
					res[1]=j;
				}
        	}
        }
        return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoSum twoSum=new TwoSum();
		int[] numbers= {2,3};
		int target=5;
		System.out.println(twoSum.twoSum(numbers, target));
	}

}
