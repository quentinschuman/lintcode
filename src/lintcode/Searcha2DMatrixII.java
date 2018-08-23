package lintcode;

public class Searcha2DMatrixII {

	public int searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return 0;
		int m = matrix.length;
		int n = matrix[0].length;
		int count = 0;
		int row = m - 1;
		int col = 0;
		while (row >= 0 && row < m && col >= 0 && col < n) {
			int cur = matrix[row][col];
			if (cur == target) {
				count++;
				col++;
				row--;
			} else if (cur > target) {
				row--;
			} else
				col++;
		}
		return count;
	}

	public static void main(String[] args) {
		Searcha2DMatrixII searcha2dMatrixII = new Searcha2DMatrixII();
		int[][] matrix = { { 1, 3, 5, 7 }, { 2, 4, 7, 8 }, { 3, 5, 9, 10 } };
		int target = 3;
		System.out.println(searcha2dMatrixII.searchMatrix(matrix, target));
	}

}
