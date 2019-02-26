package cos.algorithm.level1.x만큼간격이있는n개의숫자;

public class Sujini1002 {

	public static void main(String[] args) {
		int x = 100000000;
		int n = 1000;
		long[] result = solution(x,n);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"\t");
		}

	}
	public static long[] solution(int x, int n) {
	      long[] answer = {};
	      
	      answer = new long[n];
	      
	      long mul = 1;
	      
	      
	      for(int i=0;i<answer.length;i++) {
	    	  mul = (long)x*(i+1);
	    	  answer[i]= mul;
	      }
	      
	      
	      return answer;
	}

}
