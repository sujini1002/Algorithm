package cos.algorithm.level1.핸드폰번호가리기;

public class Sujini1002 {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}
	public static String solution(String phone_number) {
	      String answer = "";
	      
	      int length = phone_number.length()-4;
	      
	      for(int i=0;i<length;i++) {
	    	  answer += "*";
	      }
	      
	      String last = phone_number.substring(length);
	      
	      answer += last;
	      
	      return answer;
	}
}
