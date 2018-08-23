/**
* @project_name leetcode
* @author quent
* @date 2018年8月19日
* @time 上午10:07:35
*/
package lintcode;

import java.util.List;

/**
 * @author quent
 *
 */
public interface NestedInteger {
	      public boolean isInteger();
	 
	      // @return the single integer that this NestedInteger holds,
	      // if it holds a single integer
	      // Return null if this NestedInteger holds a nested list
	      public Integer getInteger();
	 
	      // @return the nested list that this NestedInteger holds,
	      // if it holds a nested list
	      // Return null if this NestedInteger holds a single integer
	      public List<NestedInteger> getList();
}
