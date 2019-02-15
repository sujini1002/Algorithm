package cos.algorithm.level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alreadyna {
	
	 public int[] solution(int[] arr, int divisor) {
	      Arrays.sort(arr);
	      
	      int length = arr.length;
	      int[] answer = {};
	      List<Integer> tempAnswer = new ArrayList<Integer>();
	      
	      for(int i=0; i<length; i++){
	          if(arr[i]%divisor == 0) tempAnswer.add(arr[i]);
	      }      
	     
	      if(tempAnswer.size()==0) {
	          answer = new int[1];
	          answer[0] = -1;
	      } else {
	          answer = new int[tempAnswer.size()];
	          for(int i=0; i<tempAnswer.size(); i++){
	              answer[i]=tempAnswer.get(i);
	          }
	      }
	      
	      return answer;
	  }

}
