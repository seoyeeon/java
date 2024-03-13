import java.util.Scanner;
public class baekjoon_25305 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
    
        int A[] = new int[N];
    
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(A[j] > A[i]){
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }

        System.out.println(A[k-1]);

    }
    

}
