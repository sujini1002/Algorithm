package cos.algorithm.level1.정수내림차순으로배치하기;

import java.util.Arrays;

public class Sujini1002 {

	public static void main(String[] args) {
		long n = 1;
		System.out.println(solution(n));
	}
	static long solution(long n) {
		
		long answer = 0;
		String nStr = n +"";
		
		int[] arr = new int[nStr.length()];
		int i =0;
		while(true) {
			if(n<10) {
				arr[0] = (int)n;
			}else {
				int tmp = (int) (n % 10);
				arr[i] = tmp;
				n = n / 10;
				i++;
			}
			if(n<10) {
				arr[i] = (int)n;
				break;
			}
		}
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		for(int j=0;j<arr.length;j++) {
			answer = (long) (answer + arr[j] *(Math.pow(10.0, j)));
		}
		
		return answer;
	}

}
