package cos.algorithm.level1.올바른괄호;

public class hajiseung {

	public static void main(String[] args) {
		System.out.println(Solution.solution("())(()"));
	}

}

//올바른 괄호
class Solution {
	public static boolean solution(String s) {
		boolean answer = true;
		String[] tmpArray = s.split("");
		int arraySize = tmpArray.length;
		int cnt = 0;
		for (int i = 0; i < arraySize; i++) {
			if (tmpArray[i].equals("("))
				cnt++;
			else if (tmpArray[i].equals(")"))
				cnt--;
			if ((cnt == -1) || (i == arraySize - 1 && tmpArray[i].equals("("))) {
				return answer = false;
			}
		}

		if (cnt != 0) {
			answer = false;
		} else {
			answer = true;
		}
		return answer;
	}
}