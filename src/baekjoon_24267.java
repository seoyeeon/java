import java.io.*; /*못품 */
public class baekjoon_24267 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        
        bw.write(n*(n-1)*(n-2)/(3*2) + "\n" + 3);
        bw.flush();
        bw.close();


        
        

    }
}
