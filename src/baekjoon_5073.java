import java.util.Scanner;
public class baekjoon_5073 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a == 0 && a == b && b == c){
                break;
            }
            else if(Math.max(Math.max(a, b),c) >= a+b+c - Math.max(Math.max(a, b),c)){
                System.out.println("Invalid");
            }
            else if(a == b && b == c && c == a){
                System.out.println("Equilateral");
            }
            else if(a == b || b == c || c == a){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }

        }
    }
}
