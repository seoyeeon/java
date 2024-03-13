import java.util.Scanner;
public class baekjoon_2798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int sum = 0;
        int sim = 0;

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    sum = A[k] + A[j] + A[i];
                    if(sum <= M && sum > sim){
                        sim = sum;
                        sum = 0;
                    }
                    else{
                        sum = 0;
                    }
                }
            }
        }
        System.out.println(sim);
            
        
    }
}
