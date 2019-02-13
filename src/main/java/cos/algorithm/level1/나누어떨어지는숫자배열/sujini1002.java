package cos.algorithm.level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sujini1002 {

	public static void main(String[] args) {
		int[] array = {5,9,7,10};
		int divisor = 5;
		int[] result = solution(array,divisor);
	}
	static int[] solution(int[]arr,int divisor) {
		int[] answer = {};
		//divisor로 나누어 떨어지는 숫자는 배열에 정렬하여 반환 한개도 없을 경우 -1반환
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%divisor == 0) {
				//나누어 떨어진 수
				list.add(arr[i]);
			}
		}
		if(list.size()==0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			for(int i =0;i<answer.length;i++) {
				answer[i]= list.get(i);
			}
			Arrays.sort(answer);
		}
		
		return answer;
	}
}
