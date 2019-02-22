package cos.algorithm.level1.정수제곱근판별;

public class Sujini1002 {

	public static void main(String[] args) {
		long n = 1;
		System.out.println(solution(n));
	}
	static long solution(long n) {
		
		long answer = 0;
	      

		for(long i = 1;i<=n/2 +1;i++) {
			if(i*i==n) {
				answer = (i+1)*(i+1);
                break;
			}
		}
		
		
		if(answer ==0)
            answer = -1;
		
		return answer;
	}
}
