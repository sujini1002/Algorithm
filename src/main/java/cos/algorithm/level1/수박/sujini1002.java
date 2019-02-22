package cos.algorithm.level1.수박;

public class sujini1002 {

	public static void main(String[] args) {
		int n = 8;
		String result = solution(n);
		System.out.println(result);
	}
	static String solution(int n) {
		String answer = "";
		
		
		for(int i=1;i<=n/2;i++) {
			answer += "수박";
		}
		
		if(n%2 !=0)
			answer += "수";
		
		return answer;
	}

}
