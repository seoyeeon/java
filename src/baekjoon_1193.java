import java.util.Scanner;
public class baekjoon_1193 { /*못품 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int prevCountSum = 0;
        int currCount = 1;

        while(true){
            if(X <= prevCountSum + currCount){
                if(currCount % 2 == 0){
                    System.out.println((X-prevCountSum) + "/" + (currCount-(X-prevCountSum-1)));
                }
                else{
                    System.out.println((currCount-(X-prevCountSum-1)) + "/"+ (X-prevCountSum));
                }    
                break;
            }
            
            else{
                prevCountSum += currCount;
                currCount++;
            }
        }
    }
}
