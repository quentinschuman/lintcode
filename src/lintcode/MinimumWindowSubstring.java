package lintcode;

import java.util.HashMap;

/*
 * 描述
给定一个字符串source和一个目标字符串target，在字符串source中找到包括所有目标字符串字母的子串。
 */
public class MinimumWindowSubstring {

	public String minWindow(String source, String target) {
		if (source == null || target == null) {
			return "";
		}
		if (source.contains(target)) {
			return target;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<target.length();i++) {
			if (map.containsKey(target.charAt(i))) {
				map.put(target.charAt(i), map.get(target.charAt(i))+1);
			}else {
				map.put(target.charAt(i),1);
			}
		}
		int left=0;
		int count=0;
		int minLen=source.length()+1;
		int minStart=0;
		for(int right=0;right<source.length();right++) {
			if (map.containsKey(source.charAt(right))) {
				map.put(source.charAt(right), map.get(source.charAt(right))-1);
				if (map.get(source.charAt(right))>=0) {
					count++;
				}
				while(count==target.length()) {
					if (right-left+1<minLen) {
						minLen=right-left+1;
						minStart=left;
					}
					if (map.containsKey(source.charAt(left))) {
						map.put(source.charAt(left), map.get(source.charAt(left))+1);
						if (map.get(source.charAt(left))>0) {
							count--;
						}
					}
					left++;
				}
			}
		}
		if (minLen>source.length()) {
			return "";
		}
		return source.substring(minStart, minStart+minLen);
	}

	public static void main(String[] args) {
		MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
		String source = "ADOBECODEBANC";
		String target = "ABC";
		System.out.println(minimumWindowSubstring.minWindow(source, target));
	}

}
