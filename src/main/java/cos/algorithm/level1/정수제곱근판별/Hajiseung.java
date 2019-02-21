package cos.algorithm.level1.정수제곱근판별;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 제곱근 판별
		int a = 121;
		Solution.solution(a);

	}

}

//정수 제곱근 판별(통과)
class Solution {
	public static long solution(long n) {
		long answer = 0;
		for (long i = 1; i <= (n / i); i++) {
			answer = i;
			if (n == answer * answer) {
				answer = (answer + 1) * (answer + 1);
			} else {
				answer = -1;
			}
		}
		return answer;
	}
}