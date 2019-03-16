package cos.algorithm.level2.전화번호목록;

public class Sujini1002 {

	public static void main(String[] args) {
		String[] phone_book = {"113", "12340", "123440", "12345", "98346"};
		System.out.println(solution(phone_book));
	}
	public static  boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        int min = phone_book[0].length();
	        String compare = phone_book[0];
	        int index = 0;
	        
	        for(int i=0;i<phone_book.length;i++) {
	        	phone_book[i] = phone_book[i].replaceAll(" ", "");
	        	if(phone_book[i].length()<min) {
	        		min = phone_book[i].length();
	        		compare = phone_book[i];
	        		index = i;
	        	}
	        }
	        
	        for(int i=0;i<phone_book.length;i++) {
	        	String tmp = phone_book[i].substring(0, min);
	        	if(compare.equals(tmp)&& i!=index) {
	        		System.out.println(phone_book[i]+"일 때"+compare+"와 같음");
	        		answer = false;
	        		break;
	        	}
	        }
	        
	        return answer;
	}

}
