package cos.algorithm.level1.자연수뒤집어배열로만들기;

import java.util.Stack;

public class Alreadyna {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자연수 뒤집어 배열로 만들기
		long a = 12345;
		int[] answer = makeArr(a);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}


	public static int[] makeArr(long n) {
		String temp = String.valueOf(n);
		int length = temp.length();
		int[] answer = new int[length];
		
		Stack<Character> answerTemp = new Stack<Character>();
		
		for(int i=0; i<length; i++) {
			answerTemp.push(temp.charAt(i));
			System.out.println(answerTemp.toString());
		}
		
		for(int i=0; i<length; i++) {
			answer[i] = answerTemp.pop()-'0';
		}
		
		return answer;
	}

}
