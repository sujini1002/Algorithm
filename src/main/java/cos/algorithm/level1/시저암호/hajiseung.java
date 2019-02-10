package cos.algorithm.level1.시저암호;

public class hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시저 암호
		String a = "a B z";
		int b = 4;
		Solution.solution(a, b);
	}

}

//시저 암호(통과)
class Solution {
	public static String solution(String s, int n) {
		String answer = "";

		StringBuffer sb = new StringBuffer(s.length());

		char[] array = s.toCharArray();
		int length = s.length();
		for (int index = 0; index < length; index++) {
			if (array[index] == ' ') {
				sb.append(' ');
			} else if (Character.isUpperCase(array[index]) == true) {
				if (array[index] + n > 'Z') {
					sb.append((char) (array[index] - 26 + n));
				} else {
					sb.append((char) (array[index] + n));
				}
			} else {
				if (array[index] + n > 'z') {
					sb.append((char) (array[index] - 26 + n));
				} else {
					sb.append((char) (array[index] + n));
				}
			}
		}
		answer = sb.toString();
		return answer;
	}
}