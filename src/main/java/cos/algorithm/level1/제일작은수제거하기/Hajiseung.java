package cos.algorithm.level1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.List;

public class Hajiseung {

	public static void main(String[] args) {
		// 제일 작은 수 제거하기
		int[] a = { 4, 3, 2, 1 };
//		int[] a = { 10 };
		Solution.solution(a);
	}

}

//제일 작은 수 제거하기(통과)
class Solution {
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>(arr.length);
		int length = arr.length;
		int[] answer = null;

		if (arr.length <= 1) {
			answer = new int[] { -1 };
		} else {
			int min = arr[0];
			for (int index = 0; index < length; index++) {
				if (arr[index] < min) {
					min = arr[index];
				}
			}
			for (int index = 0; index < length; index++) {
				if (arr[index] != min) {
					list.add(arr[index]);
				}
			}
			int size = list.size();
			answer = new int[size];
			for (int index = 0; index < size; index++) {
				answer[index] = list.get(index);
			}
		}
		return answer;
	}
}