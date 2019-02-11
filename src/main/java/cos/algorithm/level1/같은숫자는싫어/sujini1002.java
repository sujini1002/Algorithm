package cos.algorithm.level1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class sujini1002 {
	
	public static void main(String[] args) {
		int[] arr= {1,1,3,3,0,1,1};
		
		int[] result = solution2(arr);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	static int[] solution(int[] arr) {
		int[]  answer = {};
		//문제 : 연속 된 배열 요소를 제거하기
		//제거된 값을 answer 배열에 넣기
		List<Integer> result = new ArrayList<Integer>();
		
		int tmp = arr[0];
		result.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!= tmp) {
				result.add(arr[i]);
				tmp = arr[i];
			}
		}
		
		answer = new int[result.size()];
		Object[] o = result.toArray();
		for (int i = 0; i < o.length; i++) {
			answer[i] = (Integer)o[i];
		}
		return answer;
	}
	
	static int[] solution2(int[] arr) {
		int[]  answer = {};
		//문제 : 연속 된 배열 요소를 제거하기
		//제거된 값을 answer 배열에 넣기
		String result = "";
		
		int tmp = arr[0];
		result = tmp + "";
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!= tmp) {
				result = result + arr[i];
				tmp = arr[i];
			}
		}
		answer = new int[result.length()];
		for(int i=0;i<answer.length;i++) {
			answer[i] = Integer.parseInt(result.substring(i, i+1));
		}
		return answer;
	}

}
