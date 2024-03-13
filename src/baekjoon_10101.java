import java.util.Scanner;
public class baekjoon_10101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b + c != 180){
            System.out.println("Error");
            return;
        }

        if(a == 60 && a == b && b == c){
            System.out.println("Equilateral");
            return;
        }

        if(a == b || b == c || c == a){
            System.out.println("Isosceles");
            return;
        }

        else{
            System.out.println("Scalene");
        }



    }
}
