/**
* @project_name coding
* @author quent
* @date 2018年9月30日
* @time 上午9:43:41
*/
package pat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer A=scanner.nextInt();
		Integer B=scanner.nextInt();
		Integer D=scanner.nextInt();
		Integer sum=A+B;
		StringBuffer sb=new StringBuffer();
		sb=Format(sum,D,sb);
		System.out.println(sb.reverse());
		scanner.close();
	}

	/**
	 * @param sum
	 * @param d
	 * @param list
	 * @return
	 */
	private static StringBuffer Format(Integer sum, Integer D, StringBuffer sb) {
		while(sum!=0) {
			int n=sum%D;
			sb.append(n);
			sum=sum/D;
		}
		return sb;
	}
}