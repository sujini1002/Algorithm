package cos.algorithm.level1.자릿수더하기;

public class Sujini1002 {

	public static void main(String[] args) {
		int n =987;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		int answer = 0;
		
		String nStr = n +"";
		
		for(int i=nStr.length();i>0;i--) {
			answer += n %10;
			n = n / 10;
		}
		
		return answer;
	}

}
