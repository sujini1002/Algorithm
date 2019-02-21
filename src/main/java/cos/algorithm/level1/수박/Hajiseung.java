package cos.algorithm.level1.수박;

public class Hajiseung {

	public static void main(String[] args) {
		int a = 3;
		Solution.solution(a);
	}
}

class Solution {
	public static String solution(int n) {
		String answer = "";
		String[] waterMelon = { "수박", "수" };
		for (int i = 0; i < n / 2; i++) {
			answer += waterMelon[0];
		}
		if (n % 2 != 0) {
			answer += waterMelon[1];
		}
		return answer;
	}
}