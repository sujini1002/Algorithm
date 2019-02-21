package cos.algorithm.level1.자릿수더하기;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자릿수 더하기
		int a = 123;
		Solution.solution(a);
	}

}

//자릿수 더하기(통과)
class Solution {
	public static int solution(int n) {
		int answer = 0;
		String a = n + "";
		String[] kkk = a.split("");
		int length = a.length();
		for (int i = 0; i < length; i++) {
			answer += Integer.parseInt(kkk[i]);
		}
		return answer;
	}
}