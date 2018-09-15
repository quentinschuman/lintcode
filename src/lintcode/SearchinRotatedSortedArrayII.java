/**
* @project_name coding
* @author quent
* @date 2018年9月14日
* @time 下午4:28:08
*/
package lintcode;

/**
 * @author quent
 *
 */
public class SearchinRotatedSortedArrayII {

	public boolean search(int[] A, int target) {
        // write your code here
		boolean flag=false;
		for(int i=0;i<A.length;i++) {
			if (A[i]==target) {
				flag=true;
			}
		}
		return flag;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchinRotatedSortedArrayII searchinRotatedSortedArrayII=new SearchinRotatedSortedArrayII();
		int[] A= {1,1,0,1,1,1};
		int target=1;
		System.out.println(searchinRotatedSortedArrayII.search(A, target));
	}

}
