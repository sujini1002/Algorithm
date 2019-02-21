package cos.algorithm.level1.핸드폰번호가리기;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 핸드폰번호 가리기
		String a = "01033377686";
		Solution.solution(a);
	}

}

//핸드폰번호 가리기
class Solution {
	public static String solution(String phone_number) {
		String answer = "";
		StringBuffer sb = new StringBuffer(phone_number.length());
		sb.append(phone_number);
		int length = phone_number.length();

		for (int i = 0; i < length - 4; i++) {
			sb.setCharAt(i, '*');
		}
		answer = sb.toString();
		return answer;
	}
}