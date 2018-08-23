/**
* @project_name leetcode
* @author quent
* @date 2018年8月19日
* @time 上午9:56:17
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class FlattenList {
	public List<Integer> flatten(List<NestedInteger> nestedList) {
		boolean isFlat = true;
		List<NestedInteger> ls = nestedList;
		while (isFlat) {
			isFlat = false;
			List<NestedInteger> newLs = new ArrayList<>();
			for (NestedInteger ni : ls) {
				if (ni.isInteger()) {
					newLs.add(ni);
				} else {
					newLs.addAll(ni.getList());
					isFlat = true;
				}
			}
			ls = newLs;
		}
		List<Integer> r = new ArrayList<>();
		for (NestedInteger ni : ls) {
			r.add(ni.getInteger());
		}
		return r;
	}
	public static void main(String[] args) {
		FlattenList flattenList = new FlattenList();
		List<NestedInteger> nestedList = new ArrayList<>();
		
	}
}
