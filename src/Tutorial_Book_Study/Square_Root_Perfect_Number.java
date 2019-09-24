package Tutorial_Book_Study;
import java.util.*;
public class Square_Root_Perfect_Number {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        double i, x, y, n;
        
        for(i=1;i<=test;i++){
            n = s.nextDouble();
            x = Math.sqrt(n);
            y = (int)Math.sqrt(n);
            
            String result = (x>y) ? "NO" : "YES";
            
            System.out.println(result);
        }
    }
}
