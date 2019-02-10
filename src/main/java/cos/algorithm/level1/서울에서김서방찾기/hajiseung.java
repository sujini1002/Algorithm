package cos.algorithm.level1.서울에서김서방찾기;

public class hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서울에서 김서방 찾기
		String[] a = { "jane", "Kim" };
		Solution.solution(a);
	}

}

//서울에서 김서방 찾기(통과) array.asList도 있떠라
class Solution {
	public static String solution(String[] seoul) {
		String answer = "";
		int length = seoul.length;
		for (int index = 0; index < length; index++) {
			if (seoul[index].equals("Kim")) {
				answer += "김서방은 " + index + "에 있다";
				break;
			}
		}
		return answer;
	}
}