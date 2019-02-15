package cos.algorithm.level1.약수의합;

public class sujini1002 {

	public static void main(String[] args) {
		int n = 12;
		int result = solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
		 int answer = 0;
	     
		 int half = n/2;
		 
	     for(int i=1;i<=half;i++){
	          if(n%i==0) {
	        	  answer = answer + i;
	          }
	     }
	     
	     answer = answer + n;
	      
	      return answer;
	}
	

}
