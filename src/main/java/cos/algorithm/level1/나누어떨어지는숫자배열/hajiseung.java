package cos.algorithm.level1.나누어떨어지는숫자배열;

import java.util.*;

public class hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나누어 떨어지는 숫자 배열
		int[] a = { 5, 9, 7, 10 };
		int b = 11;
		Solution.solution(a, b);
	}

}

//나누어 떨어지는 숫자 배열(통과)
class Solution {
	public static int[] solution(int[] arr, int divisor) {
		int length = arr.length;
		SortedSet<Integer> result = new TreeSet<Integer>();
		for (int index = 0; index < length; index++) {
			if (arr[index] % divisor == 0) {
				result.add(arr[index]);
			}
		}

		int[] answer = new int[result.size() == 0 ? 1 : result.size()];

		if (result.size() != 0) {

			Iterator<Integer> it = result.iterator();
			int cnt = 0;
			while (it.hasNext()) {
				answer[cnt] = it.next();
				cnt++;
			}
		} else {
			answer[0] = -1;
		}
		return answer;
	}
}