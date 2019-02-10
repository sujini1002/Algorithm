package cos.algorithm.level1.같은숫자는싫어;

import java.util.LinkedList;
import java.util.List;

public class hajiseung {

	public static void main(String[] args) {
		// 같은 숫자는 싫어(통과)
		int[] a = { 1, 1, 3, 3, 0, 1, 1 };
		int[] b = { 4, 4, 4, 3, 3 };
		Solution.solution(a);
	}

}

//같은 숫자는 싫어(통과)
class Solution {
	public static int[] solution(int[] arr) {

		int length = arr.length;
		List<Integer> list = new LinkedList<Integer>();

		for (int index = 0; index < length; index++) {
			if (index != length - 1 && arr[index] == arr[index + 1]) {
				continue;
			} else {
				list.add(arr[index]);
			}
		}
		int[] answer = new int[list.size()];
		Object[] result = list.toArray();

		for (int i = 0; i < result.length; i++) {
			answer[i] = (int) result[i];
		}

		return answer;
	}
}