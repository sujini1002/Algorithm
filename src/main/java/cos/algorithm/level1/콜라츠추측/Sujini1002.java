package cos.algorithm.level1.콜라츠추측;

public class Sujini1002 {

	public static void main(String[] args) {
		int n = 626331;
		System.out.println(solution(n));
	}
	public static int solution(int num) {
	      int answer = 0;
	      
	      long tmp = (long)num;
	      
	      int cnt = 0;
	      
	      while(tmp!=1) {
	    	  
	    	  if(tmp%2==0) {
	    		  tmp = tmp/2;
	    	  }else {
	    		  tmp = (tmp*3)+1;
	    	  }
	    	  cnt++;
	    	  
	      }
	      
	      if(cnt>=500)
	    	  answer = -1;
	      else
	    	  answer = cnt;
	      
	      return answer;
	}
}
