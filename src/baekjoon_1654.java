/*시간초과 -> 못품 */
import java.util.Arrays;
import java.util.Scanner;
public class baekjoon_1654 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        long A[] = new long[K];
        long max = 0;

        for(int i = 0; i < K; i++){
            A[i] = sc.nextLong();
            max = Math.max(max, A[i]);
        }
        Arrays.sort(A);
        long left = 1;
        long right = max;
        long result = 0;

        while(left <= right){
            long mid = (left + right) / 2;
            long count = 0;

            for(int i = 0; i < K; i++){
                count += A[i] / mid;
            }

            if(count >= N){
                result = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        System.out.println(result);
        
    }
}
