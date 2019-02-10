package cos.algorithm.level1.달력2016년;

import java.util.Calendar;

public class hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 24;

		Solution.solution(a, b);
	}

}

//2016년
class Solution {
	public static String solution(int a, int b) {
		String answer = "";
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		Calendar calendar = Calendar.getInstance();

		calendar.set(2016, a - 1, b);
		answer = day[calendar.get(Calendar.DAY_OF_WEEK) - 1];
		return answer;
	}
}