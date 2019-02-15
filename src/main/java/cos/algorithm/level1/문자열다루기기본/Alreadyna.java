package cos.algorithm.level1.문자열다루기기본;

public class Alreadyna {
	public boolean solution(String s) {
	      boolean answer = true;
	      int length=s.length();
	      if(length == 4 ||  length  == 6){
	          try {
	              int temp = Integer.parseInt(s);
	          } catch (NumberFormatException e){
	              answer = false;
	          }
	      } else {
	          answer = false;
	      }
	      
	      return answer;
	  }

}
