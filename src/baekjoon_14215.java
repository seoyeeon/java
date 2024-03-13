import java.util.Scanner;
public class baekjoon_14215 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            if(a >= b+c){
                a = b + c - 1;
                System.out.println(a+b+c);
            }
            else{
                System.out.println(a+b+c);
            }
            
        }

        else if(b > a && b > c){
            if(b >= a + c){
                b = a + c - 1;
                System.out.println(a+b+c);
            }
            else{
                System.out.println(a+b+c);
            }
            
        }

        else if(c > b && c > a){
            if(c >= a + b){
                c = a + b - 1;
                System.out.println(a+b+c);
            }
            else{
                System.out.println(a+b+c);
            }
        } 

        else{
            System.out.println(a+b+c);
        }
    }
}
