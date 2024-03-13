import java.util.Scanner;
public class baekjoon_19532 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x, y;

        x = (c*e-b*f)/(e*a-b*d);
        y = (a*e*f+c*b*d-d*c*e-a*b*f)/((e-b)*(e*a-b*d));

        System.out.print(x + " ");
        System.out.println(y);
    }
}
