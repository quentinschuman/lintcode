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
		int[] indexs=new int[2];
		int start=0;
		int end=0;
		if (A==null || A.length<2) {
			indexs[0]=-1;
			indexs[1]=-1;
			return indexs;
		}
		for(int i=0;i<A.length;i++) {
			if (A[i]==target) {
				start=i;
			}else if (A[i]==A[i+1]) {
				break;
			}else {
				start=-1;
			}
			end=i;
		}
		if (start!=-1) {
			indexs[0]=start;
			indexs[1]=end;
		}else {
			indexs[0]=-1;
			indexs[1]=-1;
		}
		
		return indexs;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchforaRange searchforaRange=new SearchforaRange();
		int[] A= {1};
		int target=1;
		System.out.println(searchforaRange.searchRange(A, target));
	}

}
