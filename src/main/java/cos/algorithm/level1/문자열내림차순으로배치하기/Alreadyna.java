package cos.algorithm.level1.문자열내림차순으로배치하기;

import java.util.Arrays;

public class Alreadyna {


	public static String solution(String s) {
		//String answer = "";
		
		char[] sChar = s.toCharArray();
		Arrays.sort(sChar);
		String answer=""; 
		
		for(int i=sChar.length-1; i>=0; i--) {
			answer += sChar[i];
		}

		/*int[] index = new int[57];

		for (int i = 0; i < s.length(); i++) {
			index[s.charAt(i)-65]++;
		}

		for (int i = index.length - 1; i >= 0; i--) {
			if (index[i] > 0) {
				char a = (char)(i+65);
				answer += a;
			}
		}*/

		return answer;
	}

}
