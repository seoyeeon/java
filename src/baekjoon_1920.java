import java.util.Arrays;
import java.util.Scanner;
public class baekjoon_1920 {
    public static boolean binary_search(int arr[], int low, int high, int target){
        if(low > high){
            return false;
        }

        int mid = (low + high) / 2;

        if(target == arr[mid]){
            return true;
        }

        if(arr[mid] < target){
            return binary_search(arr, mid+1, high, target);
        }
        else{
            return binary_search(arr, low, mid-1, target);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        int target;
        
        for(int i = 0; i < M; i++){
            target = sc.nextInt();
            if(binary_search(A, 0, N-1, target) == true){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }  
           
        }
        sc.close();


    }


}
