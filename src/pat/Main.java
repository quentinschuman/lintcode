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
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		String[] a=str[0].split("/");
		String[] b=str[1].split("/");
		int a1=0,a2=0,b1=0,b2=0;
		String aa="";
		String bb="";
		boolean fuhao1=false,fuhao2=false;
		if (a.toString().contains("-")) {
			fuhao1=true;
			a1=Math.abs(Integer.parseInt(a[0]));
			b1=Integer.parseInt(a[1]);
		}
		if (b.toString().contains("-")) {
			fuhao2=true;
			a2=Math.abs(Integer.parseInt(b[0]));
			b2=Integer.parseInt(b[1]);
		}
		if (a1==0) {
			aa="0";
		}else if (a1!=0 && fuhao1) {
			aa="-("+(a1/b1)+" "+(a1%b1)+"/"+b1+")";
		}else {
			aa=(a1/b1)+" "+(a1%b1)+"/"+b1;
		}
		if (a2==0) {
			bb="0";
		}else if (a2!=0 && fuhao2) {
			bb="-("+(a2/b2)+" "+(a2%b2)+"/"+b2+")";
		}else {
			bb=(a2/b2)+" "+(a2%b2)+"/"+b2;
		}
		String str1=(a1*b2+a2*b1)+"/"+b1*b2;
		String str2=(a1*b2-a2*b1)+"/"+b1*b2;
		String str3=(a1*a2)+"/"+(b1*b2);
		String str4=(a1*b2)+"/"+(b1*a2);

		System.out.println(aa+" "+"+"+" "+bb+"="+(a1*b2+a2*b1)+"/"+b1*b2);
		System.out.println(aa+" "+"-"+" "+bb+"="+(a1*b2-a2*b1)+"/"+b1*b2);
		System.out.println(aa+" "+"*"+" "+bb+"="+(a1*a2)+"/"+(b1*b2));
		System.out.println(aa+" "+"/"+" "+bb+"="+(a1*b2)+"/"+(b1*a2));
	}
}