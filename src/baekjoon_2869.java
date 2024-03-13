import java.util.Scanner; /*시간초과 -> 힌트 */
public class baekjoon_2869{
    public static void main(String[] args){
        int A, B, V;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();

        int day = (V-B) / (A-B);

        if((V-B) % (A-B) != 0){
            day++;
        }

        
        
        System.out.println(day);

    }
}