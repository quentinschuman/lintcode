/**
* @project_name GitHub
* @author quent
* @date 2018年9月14日
* @time 上午7:03:47
*/
package lintcode;

/**
 * @author quent
 *
 */
public class SearchInsertPosition {

	public int searchInsert(int[] A, int target) {
        // write your code here
		int index=0;
		if (A.length==0) {
			return index;
		}
		for(int i=0;i<A.length;i++) {
			if (A[i]==target) {
				index=i;
				break;
			}else if (A[i]>target) {
				index=i;
				break;
			}else if (A[A.length-1]<target) {
				index=A.length;
			}
		}
		return index;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
		int[] A= {1,3,5,6,8,9};
		int target=7;
		System.out.println(searchInsertPosition.searchInsert(A, target));
	}

}
