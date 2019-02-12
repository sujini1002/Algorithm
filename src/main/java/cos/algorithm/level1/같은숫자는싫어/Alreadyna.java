package cos.algorithm.level1.같은숫자는싫어;

import java.util.Stack;

public class Alreadyna {
	public static int[] FindSameNo(int[] arr) {
		
		Stack<Integer> repo = new Stack<Integer>(); 
		repo.push(arr[0]);
		
		int length = arr.length;
		for(int i=1; i<length; i++) {
			if(repo.peek()!=arr[i]) repo.push(arr[i]);
		}
		
		int[] answer = new int[repo.size()];
		
		for(int i=answer.length-1; i>=0; i--) {
			answer[i]=repo.pop();
		}
		
		
		return answer;
	}

}
