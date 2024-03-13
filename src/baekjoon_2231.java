import java.util.Scanner;
public class baekjoon_2231 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
     
        for(int i = 1; i <= N; i++){
            if((i/1000000 + i%1000000/100000 + i%100000/10000 + i%10000/1000 
            + i%1000/100 + i%100/10 + i%10/1 + i) == N){
                System.out.println(i);
                break;
            }
            else if(i == N){
                System.out.println(0);
            }
            
        }
        
    }
}
