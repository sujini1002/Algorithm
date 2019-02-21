package cos.algorithm.level1.문자열을정수로만들기;

public class hajiseung {
	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		// 문자열을 정수로 바꾸기
		String a = "-1234";
		Solution.solution(a);

	}
}

//문자열을 정수로 바꾸기
class Solution {
	public static int solution(String s) {
		int answer = Integer.parseInt(s);
		return answer;
	}
}