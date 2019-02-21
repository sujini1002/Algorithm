package cos.algorithm.level1.최대공약수와최소공배수;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최대공약수와 최소공배수
		int a = 2;
		int b = 5;
		Solution.solution(a, b);
	}

}

//최대공약수와 최소공배수(통과)
class Solution {
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		if (n % m == 0) {
			answer[0] = m;
			answer[1] = n;
		} else if (m % n == 0) {
			answer[0] = n;
			answer[1] = m;
		} else {
			for (int i = 1; i <= n * m; i++) {
				if (n % i == 0 && m % i == 0) {
					answer[0] = i;
					answer[1] = i * (n / i) * (m / i);
				}
			}
		}
		return answer;
	}
}
