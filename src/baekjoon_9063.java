import java.util.Scanner;
public class baekjoon_9063 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int x[] = new int[100001];
        int y[] = new int[100001];
        int xmin = 10000;
        int ymin = 10000;
        int xmax = -10000;
        int ymax = -10000;

        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if(N == 1){
            System.out.println(0);
            return;
        }

        for(int i = 0; i < N; i++){
            if(x[i] < xmin){
                xmin = x[i];
            }
            if(x[i] > xmax){
                xmax = x[i];
            }
            if(y[i] < ymin){
                ymin = y[i];
            }
            if(y[i] > ymax){
                ymax = y[i];
            }
        }
        System.out.println((xmax-xmin) * (ymax-ymin));
    }
}
