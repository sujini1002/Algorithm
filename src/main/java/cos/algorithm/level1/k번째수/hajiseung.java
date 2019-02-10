package cos.algorithm.level1.k번째수;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class hajiseung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		// int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
	}

}

//K번째 수
class Solution {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = null;
		int totalComSize = commands.length; // commands 전체 길이

		LinkedList<Integer> tmp = new LinkedList<>();
		LinkedList<Integer> answerArray = new LinkedList<>();
		for (int i = 0; i < totalComSize; i++) {
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				tmp.add(array[j]);
				Collections.sort(tmp, new ArraySort());

			}
			answerArray.add(tmp.get(commands[i][2] - 1));
			tmp.clear();
		}
		answer = new int[answerArray.size()];
		for (int i = 0; i < answerArray.size(); i++) {
			answer[i] = answerArray.get(i);
			System.out.println("answer[i]:" + answer[i]);
		}
		return answer;
	}
}

class ArraySort implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}