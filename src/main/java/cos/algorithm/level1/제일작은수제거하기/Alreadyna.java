package cos.algorithm.level1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alreadyna {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 2, 4, 1 };
		int[] answer = solution(arr);
		for (int i = 0; i < answer.length; i++)
			System.out.print(answer[i] + " ");

	}

	public static int[] solution(int[] arr) {
		int length = arr.length;
		int[] answer = { -1 };

		if (length == 1) {
			return answer;
		} else {
			answer = new int[length - 1];
			int min = arr[0];
			for (int i = 1; i < length; i++) {
				if (min > arr[i])
					min = arr[i];
			}
			int index = 0;
			for (int i = 0; i < length; i++) {

				if (arr[i] != min) {
					answer[index] = arr[i];
					index++;
				}
			}

		}

		return answer;
	}
}
