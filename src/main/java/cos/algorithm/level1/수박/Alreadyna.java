package cos.algorithm.level1.수박;

public class Alreadyna {
	public String subak(int n) {
	      String answer = "";
	      
	      char su = '수';
	      char bak = '박';
	      
	      for(int i=0; i<n; i++) {
	    	  if(i%2==0) answer += su;
	    	  else answer += bak;
	      }
	      
	      
	      return answer;
	  }
}
