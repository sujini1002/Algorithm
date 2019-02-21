package cos.algorithm.level1.자연수뒤집어배열로만들기;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자연수 뒤집어 배열로 만들기
		int a = 12345;
		Solution.solution(a);
	}

}

//자연수 뒤집어 배열로 만들기(통과)
class Solution {
	public static int[] solution(long n) {
		String tmp = n + "";
		int length = tmp.length();
		int[] answer = new int[length];
		int index = 0;
		System.out.println(n);
		while (n > 0) {
			answer[index] = (int) (n % 10);
			n /= 10;
			index++;
		}
		return answer;
	}
}