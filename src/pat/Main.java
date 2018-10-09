/**
* @project_name coding
* @author quent
* @date 2018年9月30日
* @time 上午9:43:41
*/
package pat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
//		int[] nums=new int[10];
//		StringBuffer sb=new StringBuffer();
//		for(int i=0;i<10;i++) {
//			nums[i]=scanner.nextInt();
//		}
//		for(int j=0;j<10;j++) {
//			if (nums[0]!=0) {
//				
//			}
//			if (nums[j]!=0) {
//				for(int k=0;k<nums[j];k++) {
//					sb.append(j);
//				}
//			}
//			if (nums[j]==0) {
//				sb.append(0);
//			}
//		}
//		System.out.println(Integer.parseInt(sb.toString()));
//		scanner.close();
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String[] b=bf.readLine().trim().split(" ");
		int[] a=new int[b.length];
		int count=0;
		int zero=Integer.parseInt(b[0]);
		for(int i=1,j=a.length;i<j;i++) {
			a[i]=Integer.parseInt(b[i]);
			if (a[i]!=0) {
				for(int c=0;c<a[i];c++) {
					System.out.print(i);
					count++;
					if (zero!=0 && count==1) {
						for(int d=0;d<zero;d++) {
							System.out.print("0");
						}
					}
				}
			}
		}
	}
}