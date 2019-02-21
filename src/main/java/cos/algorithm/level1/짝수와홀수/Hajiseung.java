package cos.algorithm.level1.짝수와홀수;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 짝수와 홀수
		int a = 20;
		Solution.solution(a);
	}

}

//짝수와 홀수
class Solution {
	public static String solution(int num) {
		String answer = "Odd";
		if (num % 2 == 0) {
			answer = "Even";
		}
		return answer;
	}
}