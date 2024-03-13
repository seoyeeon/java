import java.util.Scanner;
public class baekjoon_3009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = 0;
        int y = 0;

        if(a == c){
            x = e;
        }
        if(a == e){
            x = c;
        }
        if(c == e){
            x = a;
        }
        if(b == d){
            y = f;
        }
        if(b == f){
            y = d;
        }
        if(d == f){
            y = b;
        }
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);


    }
}
