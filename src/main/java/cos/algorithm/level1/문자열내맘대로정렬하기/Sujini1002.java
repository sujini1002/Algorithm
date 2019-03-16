package cos.algorithm.level1.문자열내맘대로정렬하기;



public class Sujini1002 {

	public static void main(String[] args) {
		String[] strings = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		int n = 2;
		String[] result = solution(strings, n);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static String[] solution(String[] strings, int n) {
	      String[] answer = {};
	      
	      answer = new String[strings.length];
	      
	      
	      for(int i=0;i<strings.length;i++) {
	    	  for(int x=i+1;x<strings.length;x++) {
	    		  if(strings[i].substring(n, n+1).compareTo(strings[x].substring(n, n+1))>0) {
	    			  String tmp = strings[i];
	    			  strings[i] = strings[x];
	    			  strings[x] =tmp;
	    		  }else if(strings[i].substring(n, n+1).compareTo(strings[x].substring(n, n+1))==0) {
	    			  if(strings[i].compareTo(strings[x])>0) {
	    				  String tmp = strings[i];
		    			  strings[i] = strings[x];
		    			  strings[x] =tmp;
	    			  }
	    		  }
	    	  }
	    	  
	      }
	      for(int i=0;i<answer.length;i++) {
	    	  answer[i] = strings[i];
	      }
	    
	      
	      return answer;
	}

}
