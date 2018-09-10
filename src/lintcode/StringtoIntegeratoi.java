/**
* @project_name GitHub
* @author quent
* @date 2018年9月10日
* @time 上午10:15:13
*/
package lintcode;

/**
 * @author quent
 *
 */
public class StringtoIntegeratoi {

	public int atoi(String str) {
//		boolean flag1 = false;
//		boolean flag2 = false;
//		int result = 0;
//		str = str.trim();
//		String regex1 = "-?[1-9]\\d*\\.?\\d*";
//		String regex2 = "[1-9]\\d*\\.?\\d*";
//		if (str.charAt(0) == '-') {
//			flag1 = true;// zheng fu shu
//		}
//		if (str.contains(".")) {
//			flag2 = true;// fu dian shu
//		}
//		if (str == null || str.length() < 1) {
//			return 0;
//		}
//		if (flag1==true && !str.matches(regex2)) {
//			return 0;
//		}
//		if (flag1==false && !str.matches(regex1)) {
//			return 0;
//		}
//		if (flag1 == false && flag2 == false) {// zhengshu feifudiaoshu
//			if (str.length() > 10) {
//				result = Integer.MAX_VALUE;
//			} else if (Integer.parseInt(str) < Integer.MAX_VALUE) {
//				result = Integer.parseInt(str);
//			} else {
//				result = Integer.MAX_VALUE;
//			}
//		}
//		if (flag1 == true && flag2 == false) {// feushu feifudianshu
//			if (str.length() > 11) {
//				result = Integer.MIN_VALUE;
//			} else if (Integer.parseInt(str) > Integer.MIN_VALUE) {
//				result = Integer.parseInt(str);
//			} else {
//				result = Integer.MIN_VALUE;
//			}
//		}
//		if (flag1 == false && flag2 == true) {// zhengshu fudiaoshu
//			if (str.indexOf(".") > 10) {
//				result = Integer.MAX_VALUE;
//			} else if (Double.parseDouble(str) < Integer.MAX_VALUE) {
//				result = (int)Double.parseDouble(str);
//			} else {
//				result = Integer.MAX_VALUE;
//			}
//		}
//		if (flag1 == true && flag2 == true) {// fushu fudianshu
//			if (str.indexOf(".") > 12) {
//				result = Integer.MIN_VALUE;
//			} else if (Double.parseDouble(str) > Integer.MIN_VALUE) {
//				result = (int)Double.parseDouble(str);
//			} else {
//				result = Integer.MIN_VALUE;
//			}
//		}
//		return result;
		if (str == null || str.length() < 1) {
			return 0;
		}
		str = str.trim();
		int i = 0;
		char flag = '+';
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		double res = 0;
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			res = res * 10 + str.charAt(i) - '0';
			i++;
		}
		if (flag == '-') {
			res = res * (-1);
		}
		if (res > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (res < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringtoIntegeratoi stringtoIntegeratoi = new StringtoIntegeratoi();
		String str = "-1";
		System.out.println(stringtoIntegeratoi.atoi(str));
	}

}
