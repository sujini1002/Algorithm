package cos.algorithm.level1.직사각형별찍기;

import java.util.Scanner;
public class Alreadyna {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        
        makeStar(a, b);
    }
    
    public static void makeStar(int a, int b){
        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}