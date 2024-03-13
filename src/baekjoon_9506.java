import java.util.Scanner;
public class baekjoon_9506 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n;
        n = sc.nextInt();
        int p = 0;
        while(n != -1){
            
            for(int t = 1; t < n; t++){
                if(n % t == 0){
                    p += t;
                    sb.append(t).append(" + ");
                }
            }
            if(p == n){
                sb.delete(sb.length()-3, sb.length()+1);
                System.out.println(n + " = "+ sb);
                sb.delete(0, sb.length()+1);
                p = 0;
            }
            else{
                sb.delete(0, sb.length()+1);
                System.out.println(n + " is NOT perfect.");
                p = 0;
            }
            n = sc.nextInt();
            
        }

    }
}
