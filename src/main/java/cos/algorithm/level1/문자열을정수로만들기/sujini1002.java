package cos.algorithm.level1.문자열을정수로만들기;

public class sujini1002 {

	public static void main(String[] args) {
		String s= "-1234";
		int result = solution(s);
		System.out.println(result);
	}
	public static int solution(String s) {
		int answer = 0;
		
		if(s.indexOf("-")<0)
			answer = Integer.parseInt(s);
		else {
			s = s.substring(1, s.length());
			answer = Integer.parseInt(s)*-1;
		}
		
		return answer;
	}
	


}
