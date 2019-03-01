package cos.algorithm.level1.문자열내맘대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Alreadyna {

	public String[] uptoMe(String[] str, int n) {

		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				/* 리턴값이 -1이면 내림차순, 0이면 같음, 1이면 오름차순 */
				if (o1.charAt(n) > o2.charAt(n)) {
					return 1;

					// n으로 추출한 인덱스 값이 같은 경우
				} else if (o1.charAt(n) == o2.charAt(n)) {
					// compareTo a와 b가 같으면 0 반환
					// a가 크면 1 , 작으면 -1
					return o1.compareTo(o2); // 재비교
				} else if (o1.charAt(n) < o2.charAt(n)) {
					return -1;
				}
				return 0;
			}
		});
		return str;

	}

}
