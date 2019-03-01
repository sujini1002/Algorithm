package cos.algorithm.level1.시저암호;

public class Alreadyna {
	public static void main(String[] args) {

		char a = 'a';
		System.out.println((int) 'z');
		System.out.println((int) 'A');
		System.out.println((int) 'Z');
	}

	public String password(String s, int n) {
		String answer = "";
		n %= 26;

		int sLength = s.length();
		
		

		for (int i = 0; i < sLength; i++) {
			char ch = s.charAt(i);
			
			if(ch != ' ') {
				ch = Character.isLowerCase(ch) ? (char) ((ch - 'a' + n) % 26 + 'a') : (char) ((ch - 'A' + n) % 26 + 'A');
			}
			answer += ch;
		}

		return answer;
	}

}
