package cos.algorithm.level1.이상한문자만들기;

public class Sujini1002 {

	public static void main(String[] args) {
		String s = "try hello world";
		String result = solution(s);
		System.out.println(result);
	}
	public static String solution(String s) {
	      String answer = "";
	      //모든 문자 소문자로 변환
	      s = s.toLowerCase();
	      //모든문자를 배열로 저장
	      String[] arr = s.split("");
	      //s의 총길이
	      int allLength  = arr.length;
	      //현재위치
	      int index = 0;
	      int word = 0;
	      while(index<allLength) {
	    	  //단어별 짝홀수 판단
	    	  
	    	  //char tmp = arr[index].charAt(index);
	    	  
	    	  if(!arr[index].equals(" ")) {
	    		  if(word%2==0) {
	    			  answer += arr[index].toUpperCase();
	    			  word++;
	    		  }else{
	    			  answer += arr[index];
	    			  word++;
	    		  }
	    	  }else {
	    		  answer += arr[index];
	    		  word = 0;
	    	  }
	    	  index++;
	      }
	      
	      
	      return answer;
	}

}
