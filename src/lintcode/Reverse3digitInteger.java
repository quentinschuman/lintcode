/**
* @project_name leetcode
* @author quent
* @date 2018年8月22日
* @time 下午11:35:01
*/
package lintcode;

/**
 * @author quent
 *
 */
public class Reverse3digitInteger {
	public int reverseInteger(int number) {
        //100-1000
		int i=number/100;
		int j=(number-100*i)/10;
		int k=number-100*i-10*j;
		if (k==0&&j!=0) {
			return j*10+i;
		}else if (k==0&&j==0) {
			return i;
		}else {
			return k*100+j*10+i;
		}
    }
	public static void main(String[] args) {
		Reverse3digitInteger reverse3digitInteger = new Reverse3digitInteger();
		System.out.println(reverse3digitInteger.reverseInteger(940));
	}
}
