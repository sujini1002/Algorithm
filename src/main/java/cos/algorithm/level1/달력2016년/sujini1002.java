package cos.algorithm.level1.달력2016년;

import java.util.Calendar;

public class sujini1002 {

	public static void main(String[] args) {
		int a = 12;
		int b = 31;
		String result = solution(a, b);
		System.out.println(result);
	}
	static String solution(int a,int b) {
		String answer = "";
		
		int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"FRI","SAT","SUN","MON","TUE","WEN","THU"};
		
		int sum = 0;
		
		for(int i=0;i<a-1;i++) {
			sum += month[i];
		}
		
		sum += (b-1);
		System.out.println(sum);
		System.out.println(sum%7);
		
		answer = day[sum%7];
		
		return answer;
	}
	
}
