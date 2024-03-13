import java.util.Scanner;
public class baekjoon_1018 {
    public static int check(char c[][], int i, int j){
        int cnt = 0;
        int p = i;
        int k = j;
        if(c[i][j] == 'W'){
            for(p = i; p <= i+7; p+=2){
                for(k = j; k <= j+7; k+=2){
                    if(c[p][k] == 'B'){
                        cnt++;
                    }
                }
                for(k = j+1; k <= j+7; k+=2){
                    if(c[p][k] == 'W'){
                        cnt++;
                    }
                }
            }
            for(p = i+1; p <= i+7; p+=2){
                for(k = j; k <= j+7; k+=2){
                    if(c[p][k] == 'W'){
                        cnt++;
                    }
                }
                for(k = j+1; k <= j+7; k+=2){
                    if(c[p][k] == 'B'){
                        cnt++;
                    }
                }
            }
        }
        if(c[i][j] == 'B'){
            for(p = i; p <= i+7; p+=2){
                for(k = j; k <= j+7; k+=2){
                    if(c[p][k] == 'W'){
                        cnt++;
                    }
                }
                for(k = j+1; k <= j+7; k+=2){
                    if(c[p][k] == 'B'){
                        cnt++;
                    }
                }
            }
            for(p = i+1; p <= i+7; p+=2){
                for(k = j; k <= j+7; k+=2){
                    if(c[p][k] == 'B'){
                        cnt++;
                    }
                }
                for(k = j+1; k <= j+7; k+=2){
                    if(c[p][k] == 'W'){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int min = 64;
        char c[][] = new char[N][M];
        String str[] = new String[N];

        for(int i = 0; i < N; i++){
            str[i] = sc.next();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                c[i][j] = str[i].charAt(j);
            }
        }

        for(int i = 0; i+7 < N; i++){
            for(int j = 0; j+7 < M; j++){
                min = Math.min(Math.min(check(c, i, j), 64-check(c, i, j)), min);

            }
        }
        System.out.println(min);
    }
}
