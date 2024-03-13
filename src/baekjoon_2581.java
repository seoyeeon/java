import java.util.Scanner;
public class baekjoon_2581 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int k[] = new int[10001];
        int cnt = 0;
        int sum = 0;
        int min = N;

        for(int i = M; i <= N; i++){
            k[i] = i;
            for(int t = 1; t <= k[i]; t++){
                if(k[i] % t == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                if(min > k[i])
                    min = k[i];
                sum += k[i];     
                cnt = 0;
            }
            cnt = 0;
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
}
