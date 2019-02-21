package cos.algorithm.level1.이상한문자만들기;

import java.util.ArrayList;
import java.util.List;

public class Hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이상한 문자 만들기
		// String a = "try hello world";
		// String a = " try hello world strys ";
		// String a = " try hello world ";
		// String a = " try hello world ";
		String a = "ha ji seung";
		Solution.solution(a);
	}

}

//이상한 문자 만들기
class Solution {
	public static String solution(String s) {
		String answer = "";
		char[] tmp2 = s.toLowerCase().toCharArray();
		List<String> list = new ArrayList<>();
		for (int index = 0; index <= tmp2.length; index++) {
			if (index != tmp2.length && tmp2[index] != ' ') {
				answer += tmp2[index];
			} else if (!answer.equals("")) {
				list.add(answer);
				answer = "";
			}
			if (index != tmp2.length && tmp2[index] == ' ') {
				list.add(" ");
			}
		}
		int size = list.size();

		String tmptmp = "";
		for (int i = 0; i < size; i++) {
			int length = list.get(i).length();
			for (int j = 0; j < length; j++) {
				if (list.get(i) != " ") {
					if (j % 2 == 0) {
						tmptmp += (char) (list.get(i).charAt(j) - 32) + "";
					} else {
						tmptmp += (char) (list.get(i).charAt(j)) + "";
					}
				} else {
					tmptmp = " ";
				}
			}
			list.set(i, tmptmp);
			tmptmp = "";
		}

		answer = String.join("", list);
		return answer;
	}
}