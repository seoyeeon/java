import java.util.Scanner;
public class baekjoon_1085 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minDistance = Math.min(Math.min(w-x, x), Math.min(h-y, y));

        System.out.println(minDistance);
    }
}
