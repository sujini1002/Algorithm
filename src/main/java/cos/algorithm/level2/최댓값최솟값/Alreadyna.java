package cos.algorithm.level2.최댓값최솟값;

public class Alreadyna {
	public String minORmax(String s) {
		String[] tempS = s.split(" ");
		int tempLength = tempS.length;
		
		String answer = "";
		
		int min = Integer.parseInt(tempS[0]), max = Integer.parseInt(tempS[0]);
		
		for(int i=1; i<tempLength; i++) {
			int temp = Integer.parseInt(tempS[i]);
			
			if(min > temp) min = temp;
			if(max < temp) max = temp;
		}
		
		
		answer = min + " " + max ;
		
		return answer;
	}

}
