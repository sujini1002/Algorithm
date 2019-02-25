package cos.algorithm.level1.최대공약수와최소공배수;

public class Sujini1002 {

	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		int[] result = solution(n,m);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] solution(int n, int m) {
	      
		
		int[] answer = {};
	      
	    int max = 0;
	    int min = 0;
	    
	    //최대 공약수
	    int tmp  = n<m?n:m;
		for(int i=1;i<=tmp;i++) {
			if(n%i==0&&m%i==0) {
				if(i>max)
					max = i;
			}
		}
		
		//최소 공배수
		int i = 1;
		
		while(true) {
			int x = n *i;
			if(x%m==0) {
				min = x;
				break;
			}else {
				i++;
			}
			
		}
		//값 넣기 
		
		answer = new int[2];
		answer[0] =max;
		answer[1]= min;
	      
	    return answer;
	}
}
