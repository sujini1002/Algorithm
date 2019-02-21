package cos.algorithm.level1.문자열다루기기본;

public class Hajiseung {

	public static void main(String[] args) {
		// 문자열 다루기 기본
		String a = "a1234";
		Solution.solution(a);
	}

}

//문자열 다루기 기본(통과)
class Solution {
	public static boolean solution(String s) {
		boolean answer = true;
		int length = s.length();
		if (4 == length || length == 6) {
			try {
				Integer.parseInt(s);
				answer = true;
			} catch (NumberFormatException e) {
				answer = false;
			}
		} else {
			answer = false;
		}
		return answer;
	}
}