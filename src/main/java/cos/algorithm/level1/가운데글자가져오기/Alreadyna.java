package cos.algorithm.level1.가운데글자가져오기;

public class Alreadyna {

	public static String FindMiddle(String s) {
		String answer ="";
		int length = s.length();
		int middleNo = length/2;
		//글자수가 짝수일 때
		if(length%2==0) {
			answer += s.charAt(middleNo-1);
			answer += s.charAt(middleNo);
		} else {
			answer += s.charAt(middleNo);
		}
		
		return answer;
	}
}
