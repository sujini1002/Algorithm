package cos.algorithm.level1.정수제곱근판별;

public class Alreadyna {
	public long solution(long n) {
		long answer = -1;
		
		double sqrt = Math.sqrt(n);
		if(isInt(sqrt)) {
			answer = (long) Math.pow(sqrt+1, 2);
		}
		
		return answer;
	}
	
	public static boolean isInt(double d) {
		return d == (int) d;
	}

}
