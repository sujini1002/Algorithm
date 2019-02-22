package cos.algorithm.level1.정수내림차순으로배치하기;

import java.util.Arrays;

public class Alreadyna {
	  public long numberToSort(long n) {
		  String temp = n+"";
		  char[] chartemp = temp.toCharArray();
		  
		  Arrays.sort(chartemp);
		  
		  temp="";
		  for(int i=chartemp.length-1; i>=0; i--) {
			  temp += chartemp[i];
		  }
	      long answer = Long.parseLong(temp);
	      return answer;
	  }
	
	

}
