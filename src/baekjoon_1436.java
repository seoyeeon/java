import java.util.Scanner; /*못품 */
public class baekjoon_1436 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int num = 666;
        int cnt = 1;

        while(cnt != N){
            num++;
            if(Integer.toString(num).contains("666")){
                cnt++;
            }
        }

        System.out.println(num);

        

    }
}
