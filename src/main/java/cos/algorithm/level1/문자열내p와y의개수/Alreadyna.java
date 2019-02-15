package cos.algorithm.level1.문자열내p와y의개수;

public class Alreadyna {
	boolean solution(String s) {
        boolean answer = true;
        
        int length = s.length();
        int cnt =0;
        
        
        for(int i=0; i<length; i++){
            char temp = s.charAt(i);
            if(temp=='p' || temp=='P') cnt++;
            else if(temp=='y' || temp=='Y') cnt--;
        }
        
        if(cnt!=0) answer = false;

        

        return answer;
    }

}
