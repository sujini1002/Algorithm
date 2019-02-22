package cos.algorithm.level1.행렬의덧셈;

public class Alreadyna {
	public int[][] sumMatrix(int[][] arr1, int[][] arr2) {
		int rowCnt = arr1.length;

		int[][] answer = new int[rowCnt][];

		for (int i = 0; i < rowCnt; i++) {
			int colCnt = arr1[i].length;
			answer[i] = new int[colCnt];

			for (int j = 0; j < colCnt; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	}

}
