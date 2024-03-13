import java.util.Scanner;
public class baekjoon_5086{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 1;
        int B = 1; 
        while(A != 0 && B != 0){
            A = sc.nextInt();
            B = sc.nextInt();
            if(A > B){
                if(A%B == 0){
                    System.out.println("multiple");
                }
                else{
                    System.out.println("neither");
                }
            }
            if(A < B){
                if(B % A == 0){
                    System.out.println("factor");
                }
                else{
                    System.out.println("neither");
                }
            }
        }
    }
}