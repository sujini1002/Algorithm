package cos.algorithm.level1.하샤드수;

public class Sujini1002 {

	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
	public static boolean solution(int x) {
	      boolean answer = true;
	      
	      int tmp = x;
	      int sum =0;
	      
	      String s = x+"";
	      int length = s.length();
	      
	      for(int i=length;i>0;i--) {
	    	  sum = sum + x%10;
	    	  x = x/10;
	      }
	      System.out.println(sum);
	      
	      if(tmp%sum!=0) {
	    	  answer = false;
	      }
	      
	      return answer;
	}
}
