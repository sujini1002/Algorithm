package cos.algorithm.level1.두정수의합;

public class sujini1002 {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		long result = solution(a,b);
		System.out.println(result);
	}
	static long solution(int a,int b) {
		long answer = 0;
		
		int max = b;
		int min = a;
		
		if(a>b) {
			max = a;
			min = b;
		}
		//문제 : 두 정수 사의 합
		for(int i=min;i<=max;i++) {
			answer = answer + i;
		}
		
		return answer;
	}
}
