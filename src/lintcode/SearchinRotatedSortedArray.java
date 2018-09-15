/**
* @project_name coding
* @author quent
* @date 2018年9月14日
* @time 下午4:12:51
*/
package lintcode;

/**
 * @author quent
 *
 */
public class SearchinRotatedSortedArray {

	public int search(int[] A, int target) {
        // write your code here
		int index=0;
		boolean flag=false;
		for(int i=0;i<A.length;i++) {
			if (A[i]==target) {
				index=i;
				flag=true;
			}
		}
		if (!flag) {
			index=-1;
		}
		return index;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchinRotatedSortedArray searchinRotatedSortedArray=new SearchinRotatedSortedArray();
		int[] A= {4,5,1,2,3};
		int target=6;
		System.out.println(searchinRotatedSortedArray.search(A, target));
	}

}
