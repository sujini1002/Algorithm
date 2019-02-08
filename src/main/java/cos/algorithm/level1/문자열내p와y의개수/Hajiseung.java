package cos.algorithm.level1.문자열내p와y의개수;

public class Hajiseung {
	public static void main(String[] args) {
		Solution sol = new Solution();
		// 문자열 내 p와 y의 개수
		String a = "pPoooYy";
		String b = "PyY";
		sol.solution(a);
	}
}

class Solution {
	public boolean solution(String s) {
		boolean answer = true;
		int pcnt = 0;
		int ycnt = 0;
		char[] result = s.toLowerCase().toCharArray();
		for (int index = 0; index < result.length; index++) {
			if (result[index] == 'p') {
				pcnt++;
			} else if (result[index] == 'y') {
				ycnt++;
			}
		}
		if (pcnt != ycnt) {
			answer = false;
		}
		return answer;
	}
}