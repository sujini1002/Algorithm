package cos.algorithm.level1.하샤드수;

public class Alreadyna {
	
	public boolean hashad(int x) {
	      boolean answer = false;
	      int xLength = (int)(Math.log10(x)+1);
	      int sum=0;
	      
	      for(int i=1; i<=xLength; i++) {
	    	  int xIndex = (int) Math.pow(10, i);
	    	  sum += (x % xIndex) / (int) Math.pow(10, i-1);
	      }
	      
	      answer = x%sum==0 ? true : false;
	      
	      
	      
	      
	      
	      return answer;
	  }

}
