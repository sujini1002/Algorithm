package cos.algorithm.level1.자릿수더하기;

public class Alreadyna {
	
	public static void main(String[] args) {
		System.out.println(57834);
		System.out.println(57834/10000);
		System.out.println(57834/1000%10);
		System.out.println(57834/100%10);
		System.out.println(57834/10%10);
		System.out.println(57834/(int)Math.pow(10, 0)%10);
		
	}
	
	public int sumDividedNum(int num) {
		
		
		int length = (int) Math.log10(num)+1;
		int answer =  num / (int) Math.pow(10, length-1);
		
		for(int i=(int) length-1; i>0; i--) {
			
			answer += num/(int)Math.pow(10, i-1)%10;
		}
		
		return answer;
	}

}
