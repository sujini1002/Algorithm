package cos.algorithm.level1.문자열내림차순으로배치하기;

public class Hajiseung {
	public static void main(String[] args) {
		Solution sol = new Solution();
		// 문자열 내림차순으로 배치하기
		String a = "Zbcdefg";
		sol.solution(a);
	}
}

class Solution {
	public String solution(String s) {
		String answer = "";
		String[] result = s.split("");
		int length = result.length;
		String tmp = "";

		for (int le = 0; le < length; le++) {
			for (int i = 0; i < length - 1; i++) {
				if (result[i].compareTo(result[i + 1]) < 0) {
					tmp = result[i + 1];
					result[i + 1] = result[i];
					result[i] = tmp;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			answer += result[i];
		}
		return answer;
	}
}