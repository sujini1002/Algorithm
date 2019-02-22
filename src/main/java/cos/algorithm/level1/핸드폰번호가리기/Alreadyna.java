package cos.algorithm.level1.핸드폰번호가리기;

public class Alreadyna {
	public String changeWithStar(String phone_number) {
		String answer = "";
		int length = phone_number.length();
		
		for(int i=0; i<length-4; i++) {
			answer += '*';
		}
		
		answer += phone_number.substring(length-4, length);
		
		return answer;
	}

}
