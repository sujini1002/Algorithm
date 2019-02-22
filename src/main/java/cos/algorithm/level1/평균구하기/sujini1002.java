package cos.algorithm.level1.평균구하기;

public class sujini1002 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));
	}
	
	 public static double solution(int[] arr) {
	      double answer = 0;
	      int sum =0;
	      
	      for(int i=0;i<arr.length;i++){
	          sum += arr[i];
	      }
	      
	      answer = sum*1.0/arr.length;
	      
	      return answer;
	  }
}
