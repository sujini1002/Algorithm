package cos.algorithm.level1.정수내림차순으로배치하기;

import java.util.Arrays;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수 내림차순으로 배치하기
		long a = 800000000L;
		Solution.solution(a);

	}

}

//정수 내림차순으로 배치하기
class Solution {
	public static long solution(long n) {
		long answer = 0;
		String num = n + "";
		String[] numArr = num.split("");
		long[] tmp = new long[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			tmp[i] = Long.parseLong(numArr[i]);
		}
		Arrays.sort(tmp);
		num = "";
		for (int i = tmp.length - 1; i >= 0; i--) {
			num += tmp[i] + "";
		}
		answer = Long.parseLong(num);
		return answer;
	}
}