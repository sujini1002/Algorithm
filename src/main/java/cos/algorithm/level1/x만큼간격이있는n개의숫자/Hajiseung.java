package cos.algorithm.level1.x만큼간격이있는n개의숫자;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x만큼 간격이 있는 n개의 숫자
		int a = -4;
		int b = 2;
		Solution.solution(a, b);
	}

}

//x만큼 간격이 있는 n개의 숫자(통과) //x에서 시작함
class Solution {
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long tmp = x;
		for (int i = 0; i < n; i++) {
			answer[i] = tmp;
			tmp += x;
		}
		return answer;
	}
}