import java.util.Scanner;
public class baekjoon_24265 {
    public static int plus(int n){
        int cnt = 0;
        while(n != 0){
            cnt += n;
            n--;
        }
        return cnt;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(plus(n-1));
        System.out.println(2);


    }
}
