/**
* @project_name GitHub
* @author quent
* @date 2018年9月10日
* @time 下午4:46:16
*/
package lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author quent
 *
 */
public class CompareStrings {

	public boolean compareStrings(String A, String B) {
//		boolean res = false;
//		if (A == null || A.length() < B.length()) {
//			res = false;
//		}
//		if (B.length() == 0) {
//			res = true;
//		}
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for (int i = 0; i < A.length(); i++) {
//			char c = A.charAt(i);
//			if (map.containsKey(c)) {
//				int value = map.get(c);
//				map.put(c, ++value);
//			} else {
//				map.put(c, 1);
//			}
//		}
//		for (int j = 0; j < B.length(); j++) {
//			char c = B.charAt(j);
//			if (map.containsKey(c)) {
//				int value = map.get(c);
//				if (--value < 0) {
//					res = false;
//				}
//				map.put(c, value);
//			} else {
//				res = false;
//			}
//		}
//		return res;
		if(A.length() < B.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(map.containsKey(c)) {
                int value = map.get(c);
                map.put(c, ++value);
            }else {
                map.put(c, 1);
            }
        }

        for(int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            if(map.containsKey(c)) {
                int value = map.get(c);
                if(--value < 0) return false;
                map.put(c, value);
            }else {
                return false;
            }
        }
        return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompareStrings compareStrings = new CompareStrings();
		String A = "A";
		String B = "";
		System.out.println(compareStrings.compareStrings(A, B));
	}

}
