import java.util.Scanner;
public class baekjoon_2501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int p[] = new int[10000];
        int cnt = 0;
        for(int i = 0; i < N; i++){
            p[i] = i+1;
            if(N % p[i] == 0){
                cnt++;
            }
            if(cnt == K){
                System.out.println(i+1);
                break;
            }
        }
        if(cnt < K){
            System.out.println(0);
        }
        
    }
}
