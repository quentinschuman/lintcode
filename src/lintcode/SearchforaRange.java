/**
* @project_name GitHub
* @author quent
* @date 2018年9月14日
* @time 上午7:41:36
*/
package lintcode;

/**
 * @author quent
 *
 */
public class SearchforaRange {

	public int[] searchRange(int[] A, int target) {
		// write your code here
		int[] res = { -1, -1 };
		if (A == null || A.length < 1)
			return res;
		int start = 0, end = A.length - 1;
		int mid;
		while (start + 1 < end) {
			mid = start + (end - start) / 2;
			if (A[mid] < target)
				start = mid;
			else
				end = mid;
		}
		if (A[start] == target)
			res[0] = start;
		else if (A[end] == target)
			res[0] = end;
		else
			return res;
		start = 0;
		end = A.length - 1;
		while (start + 1 < end) {
			mid = start + (end - start) / 2;
			if (A[mid] > target)
				end = mid;
			else
				start = mid;
		}
		if (A[end] == target)
			res[1] = end;
		else if (A[start] == target)
			res[1] = start;
		else
			return res;
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchforaRange searchforaRange = new SearchforaRange();
		int[] A = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		int target = 5;
		System.out.println(searchforaRange.searchRange(A, target));
	}

}
