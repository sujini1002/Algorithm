package cos.algorithm.level1.k번째수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sujini1002 {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = solution(array, commands);

	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        answer = new int[commands.length];
        
        List<Integer> arrList = new ArrayList<Integer>();
        
        for(int i=0;i<array.length;i++) {
        	arrList.add(array[i]);
        }
        
        for(int i=0;i<commands.length;i++) {
        	List<Integer> tmp = new ArrayList<Integer>(arrList.subList(commands[i][0]-1, commands[i][1]));
        	Collections.sort(tmp);
        	int temp = tmp.get(commands[i][2]-1);
        	answer[i] =temp;
        }
        
        
        
        return answer;
    }
}
