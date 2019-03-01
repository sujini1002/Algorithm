package cos.algorithm.level1.이상한문자만들기;

import java.util.StringTokenizer;

public class Alreadyna {
	public static void main(String[] args) {
		System.out.println(strangeString("A    a aaa A BBbbbb"));
		System.out.println(strangeString("lee mina ah"));
		System.out.println(strangeString("ha ji seung"));
		System.out.println(strangeString("try hello world"));

	}

	public static String strangeString(String s) {
		s = s.toLowerCase();

		System.out.println(s);

		String answer = "";
		
		int sLength = s.length();
		
		int count=0;
		for(int i=0; i<sLength; i++) {
			if(s.charAt(i)!=' ') {
				if(count%2==0) {
					answer += (char) (s.charAt(i) - 32);
				} else {
					answer += (char) s.charAt(i);
				}
				count++;
			} else {
				answer += ' '; 
				count=0;
			}
		}

		

		return answer;
	}

}
