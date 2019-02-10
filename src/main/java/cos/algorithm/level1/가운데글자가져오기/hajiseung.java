package cos.algorithm.level1.가운데글자가져오기;

public class hajiseung {

	public static void main(String[] args) {
		// 가운데 글자 가져오기
		String b = "abcde";
		Solution.solution(b);
	}
}

//가운데 글자 가져오기(통과)
class Solution {
	public static String solution(String s) {
		String answer = "";
		int length = s.length();
		if (length % 2 == 0) {
			// 짝수일떄
			answer = "" + s.charAt((length / 2) - 1) + s.charAt(length / 2);
		} else {
			// 홀수일때
			answer = "" + s.charAt(length / 2);
		}
		return answer;
	}
}