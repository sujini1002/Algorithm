package cos.algorithm.level1.시저암호;

public class sujini1002 {

	public static void main(String[] args) {
		String s = "y Z a";
		int n =  3;
		String result = solution(s,n);
		System.out.println(result);
	}

	private static String solution(String s, int n) {
		
		String answer = "";
				
		char[] sChar = s.toCharArray();
		
		for(int i=0;i<sChar.length;i++) {
			if(sChar[i] != ' ') {
				int tmp = sChar[i]*1;
				if(97<=tmp && tmp<123) {
					//소문자
					tmp += n;
					if(tmp>122)
						tmp  -= 26;
				}else {
					tmp += n;
					if(tmp>90)
						tmp  -= 26;
					
				}
				answer = answer + (char)tmp;
			}else {
				answer = answer + sChar[i];
			}
		}
		
		
	    return answer;
	}

}
