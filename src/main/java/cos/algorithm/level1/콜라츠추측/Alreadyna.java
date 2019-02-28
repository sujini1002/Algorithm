package cos.algorithm.level1.콜라츠추측;

public class Alreadyna {
	
	class Collatz {
		  public int solution(int num) {
		      int answer = 0;
		      // 계산 과정에서 범위 초과될 수 있음.
		      long temp = (long) num;
		      
		      while(temp!=1){
		          if(temp%2 == 0){
		              temp /= 2;
		          } else {
		              temp *= 3;
		              temp++;
		          }
		          answer++;
		      }
		      
		      if(answer>=500) {
		         answer = -1;
		      }
		      
		      return answer;
		  }
		}

}
