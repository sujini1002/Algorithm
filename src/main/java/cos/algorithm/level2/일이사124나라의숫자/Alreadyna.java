package cos.algorithm.level2.일이사124나라의숫자;

public class Alreadyna {
	
	public static void main(String[] args) {
		String s="";
		
		
		s+='a';
		System.out.println(s);
		s+='z';
		System.out.println(s);
	}
	
	public String solution(int n) {
	      String answer = "";
	      
	      int x; //나머지
	      
	      while(n>0){
	            x = n%3;
	            n = n/3;

	            if(x == 0){
	                n -= 1;
	                x = 4;
	            }

	            answer = x + answer;
	        }

	      
	      
	      return answer;
	  }

}
