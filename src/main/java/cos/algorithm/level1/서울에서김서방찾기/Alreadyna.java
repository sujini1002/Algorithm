package cos.algorithm.level1.서울에서김서방찾기;

public class Alreadyna {
	
	public static String Solution(String[] seoul) {
		String answer ="";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 "+i+"에 있다";
			}
		}
		
		
		return answer;
	}

}
