/**
* @project_name coding
* @author quent
* @date 2018年10月18日
* @time 下午3:49:59
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class kSumIIs {

	List<List<Integer> > ans;
    public void dfs(int A[], int K, int target, int index, List<Integer> tans)
    {

        if(K == 0 && target == 0) {
            ans.add(new ArrayList<Integer>(tans));
            return ;
        }
        if(K < 0 || target < 0 || index < 0)
            return ;
        dfs(A, K, target, index - 1, tans);
        tans.add(A[index]);
        dfs(A, K  - 1, target - A[index], index - 1, tans);
        tans.remove(tans.size() - 1);
        
    }
    
    public List<List<Integer>> kSumII(int A[], int K, int target) {
        ans = new ArrayList<List<Integer>>();
        List<Integer> tans = new ArrayList<Integer>();
        dfs(A, K, target, A.length - 1, tans);
        return ans;
    }
    public static void main(String[] args) {
		int[] A= {1,2,3,4};
		int K=2;
		int target=5;
		kSumIIs kSumIIs=new kSumIIs();
		System.out.println(kSumIIs.kSumII(A, K, target));
	}
}
