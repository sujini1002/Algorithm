package cos.algorithm.level1.두정수의합;

public class hajiseung {
	public static void main(String[] args) {
		// 두 정수의 합
		int a = -10000000;
		int b = 1000000;
		Solution.solution(a, b);
	}

}

//두 정수의 합
class Solution {
	public static long solution(int a, int b) {
		long answer = 0;
		return answer = (a <= b) ? plus(a, b) : plus(b, a);
	}

	public static long plus(int a, int b) {
		long result = 0;
		for (int i = a; i <= b; i++) {
			result += i;
		}
		return result;
	}
}