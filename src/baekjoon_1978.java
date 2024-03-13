import java.util.Scanner;
public class baekjoon_1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int c = 0;

        int N = sc.nextInt();
        int k[] = new int[100];
        for(int i = 0; i < N; i++){
            k[i] = sc.nextInt();
            for(int t = 1; t <= k[i]; t++){
                if(k[i] % t == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                c++;
            }
            cnt = 0;
            
        }
        System.out.println(c);

    }
}
