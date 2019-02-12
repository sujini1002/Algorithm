package cos.algorithm.level1.문자열내림차순으로배치하기;

import java.util.Arrays;

public class sujini1002 {

	public static void main(String[] args) {
		String a = "Zbcdefg";
		String result = solution(a);
		System.out.println(result);
	}
	static String solution(String s) {
		
		String answer = "";
		char[] str = s.toCharArray();
		Arrays.sort(str);
		
		for(int i=str.length-1; i>=0; i--) {
			answer += str[i];
		}
		
		//영어문자열을 내림차순으로 정렬하기
		
		
		return answer; 
	}

}
