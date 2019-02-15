package cos.algorithm.level1.문자열내p와y의개수;

public class sujini1002 {

	public static void main(String[] args) {
		String a = "pPoooYy";
		boolean result = solution(a);
		System.out.println(result);
	}

	static boolean solution(String a) {
		boolean answer = true;
		
		String[] split = a.toLowerCase().split("");
		
		int pCnt =0;
		int yCnt = 0;
		
		for(int i=0;i<split.length;i++) {
			if(split[i].equals("p")) {
				pCnt++;
			}else if(split[i].equals("y")) {
				yCnt++;
			}
		}
		
		if(pCnt != yCnt)
			answer=false;
		
		
		return answer;
	}

}
