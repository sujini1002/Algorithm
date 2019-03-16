package cos.algorithm.level2.마지막직사각형좌표;

public class Sujini1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] solution(int[][] v) {
	        int[] answer = {};
	        
	        //x축 좌표 구하기 
	        boolean x = false;
	        //y축 좌표 구하기
	        boolean y = false;
	        
	        int a = -1;
	        int b = -1;
	        
	        for(int i=1;i<v.length;i++) {
	        	if(v[0][0]==v[i][0]) {
	        		x = true;
	        	}else {
	        		a = v[i][0];
	        	}
	        	if(v[0][1]==v[i][1]) {
	        		y = true;
	        	}else {
	        		b = v[i][1];
	        	}
	        }
	        
	        answer = new int[2];
	        
	        if(x==false) {
	        	answer[0] = v[0][0];
	        }else {
	        	answer[0] = a;
	        }
	        if(y==false) {
	        	answer[1] = v[0][1];
	        }else {
	        	answer[1] = b;
	        }
	        

	        return answer;
	}
}
