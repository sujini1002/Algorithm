package cos.algorithm.level1.평균구하기;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 평균구하기
		int[] a = { 1, 2, 3, 4 };
		Solution.solution(a);
	}

}

//평균구하기(통과)
class Solution {
	public static double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer = answer / arr.length;
		return answer;
	}
}