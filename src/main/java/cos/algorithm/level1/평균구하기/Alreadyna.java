package cos.algorithm.level1.평균구하기;

public class Alreadyna {
	public double getAverage(int[] arr) {
		double size = arr.length;
		double answer = 0;
		
		for(int i=0; i<size; i++) {
			answer += arr[i];
		}
		
		answer /= size;
		
		return answer;
	}
}
