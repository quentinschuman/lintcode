/**
* @project_name coding
* @author quent
* @date 2018年9月16日
* @time 上午7:22:17
*/
package lintcode;

/**
 * @author quent
 *
 */
public class MedianoftwoSortedArrays {

	public double findMedianSortedArrays(int[] A, int[] B) {
		// write your code here
//		double res = 0.0;
//		int m = A.length;
//		int n = B.length;
//		double sum = 0;
//		int[] AB = new int[m + n];
//		if (m == 0 || n == 0) {
//			return res;
//		}
//		if (m == 0) {
//			for (int i = 0; i < n; i++) {
//				sum += B[i];
//			}
//			return res = sum / n;
//		}
//		if (n == 0) {
//			for (int i = 0; i < m; i++) {
//				sum += B[i];
//			}
//			return res = sum / m;
//		}
//		for (int i = 0; i < B.length; i++) {
//			AB[m - 1] = B[i];
//			m++;
//		}
//		for (int j = 0; j < n; j++) {
//			sum += AB[j];
//			res = sum / (m + n);
//		}
//		return res;
		int len=A.length+B.length;
		if (len%2==0) {
			return (findKth(A, B, 0, A.length, 0, B.length, len/2)+findKth(A, B, 0, A.length, 0, B.length, len/2+1))/2.0f;
		}else {
			return findKth(A, B, 0, A.length, 0, B.length, len/2);
		}
	}

	public int findKth(int[] nums1, int[] nums2, int start1, int len1, int start2, int len2, int k) {
		if (len1 > len2) {
			return findKth(nums2, nums1, start2, len2, start1, len1, k);
		}
		if (len1 == 0) {
			return nums2[start2 + k - 1];
		}
		if (k == 1) {
			return Math.min(nums1[start1], nums2[start2]);
		}
		int p1=Math.min(k/2, len1);
		int p2=k-p1;
		if (nums1[start1+p1-1]>nums2[start2+p2-1]) {
			return findKth(nums1, nums2, start1, len1, start2+p2, len2-p2, k);
		}else if (nums1[start1+p1-1]<nums2[start2+p2-1]) {
			return findKth(nums1, nums2, start1+p1, len1-p1, start2, len2, k);
		}else {
			return nums1[start1+p1-1];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MedianoftwoSortedArrays medianoftwoSortedArrays = new MedianoftwoSortedArrays();
		int[] A = { 1, 2, 3, 4, 5, 6 };
		int[] B = { 2, 3, 4, 5 };
		System.out.println(medianoftwoSortedArrays.findMedianSortedArrays(A, B));
	}

}
