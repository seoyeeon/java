import java.util.Scanner;
public class baekjoon_2587 {
    public static void main(String[] args){
        int A[] = new int[5];
        int avg = 0;
        int mid = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            A[i] = sc.nextInt();
            avg += A[i];
        }
        avg = avg / 5;

        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                if(A[i] > A[j]){
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        mid = A[2];

        System.out.println(avg);
        System.out.println(mid);
    }
}
