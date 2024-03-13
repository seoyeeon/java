import java.util.Scanner;
public class baekjoon_2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int x = 0;
        int y = 0;
        while((N - 3 * y) % 5 != 0){
            y++;
            if(y > 166 || N - 3*y < 0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println((N - 3*y)/5 + y);
       
        
    
    }
}
