package cos.algorithm.level1.약수의합;

public class hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		Solution.solution(n);
	}

}

class Solution {
	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += n / i;
			}
		}
		return answer;
	}
}