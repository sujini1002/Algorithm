package cos.algorithm.level1.가운데글자가져오기;

public class sujini1002 {

	public static void main(String[] args) {
		
		String s = "abcd";
		String answer = "";
		
		int middle = s.length()/2;
		
		if(s.length() % 2 == 0) {
			answer = s.substring(middle-1,middle+1);
		}else {
			answer = s.charAt(middle)+"";
		}
		System.out.println(answer);
	}

}
//테스트 완료