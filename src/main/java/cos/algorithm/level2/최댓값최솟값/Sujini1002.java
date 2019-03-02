package cos.algorithm.level2.최댓값최솟값;

import java.util.Arrays;

public class Sujini1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String s) {
		
	      String answer = "";
	      
	      String[] arr = s.split(" ");
	      
	      int[] nums = new int[arr.length];
	      
	      for(int i=0;i<nums.length;i++) {
	    	  nums[i] = Integer.parseInt(arr[i]);
	      }
	      
	      Arrays.sort(nums);
	      
	      answer = nums[0] + " " + nums[nums.length-1];
	      
	      return answer;
	}
}
