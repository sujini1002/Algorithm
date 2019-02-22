package cos.algorithm.level1.문자열다루기기본;

public class sujini1002 {

	public static void main(String[] args) {
		
	}
	static boolean solution(String s) {
		boolean answer = true;
		
		if(s.length()==4 || s.length()==6) {
			try {
				int a = Integer.parseInt(s);
			}catch(NumberFormatException e) {
					answer = false;
			}
			
		} else {
			answer= false;
		}
		
		
		
		
		
		return answer;
	}

}
