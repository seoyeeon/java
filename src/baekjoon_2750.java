import java.util.Scanner;
public class baekjoon_2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(A[i] > A[j]){
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
                
            }
            
        }
        for(int i = 0; i < N; i++){
            System.out.println(A[i]);
        }

        
    }
}
