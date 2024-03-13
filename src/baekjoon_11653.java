import java.util.Scanner;
public class baekjoon_11653 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        if(N == 1) return;
        int temp = N;

        for(int i = 2; i <= N; i++){
            if(temp % i == 0){
                temp = temp / i;
                System.out.println(i);
                i = 1;
            }
        }
    }
}
