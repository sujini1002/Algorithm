package cos.algorithm.level1.제일작은수제거하기;

import java.util.Arrays;

public class Sujini1002 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] result = solution(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}
	static int[] solution(int[] arr) {
		int[] answer = {};
		
		if(arr.length==1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			int[] tmp = new int[arr.length];
			for(int i=0;i<tmp.length;i++) {
				tmp[i] = arr[i];
			}
			Arrays.sort(tmp);
			
			
			
			int min = tmp[0];
			
			answer = new int[arr.length-1];
			int cnt = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=min) {
					answer[cnt] = arr[i];
					cnt++;
				}
				
			}
		}
		
		
		
		
		
		return answer;
	}
}
