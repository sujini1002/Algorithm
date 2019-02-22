package cos.algorithm.level1.자연수뒤집어배열로만들기;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Sujini1002 {

	public static void main(String[] args) {
		long n = 123345676;
		int[] result = solution(n);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}
	
	static int[] solution(long n) {
		int[] answer = {};
		
		List<Integer> list = new ArrayList<Integer>(); 
		
		while(true) {
			
			if(n<10) {
				list.add((int)n);
				break;
			}else {
				int tmp = (int) (n % 10);
				list.add(tmp);
				n = n / 10;
			}
			if(n<10) {
				list.add((int)n);
				break;
			}
		}
		answer = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
		
		return answer;
	}

}
