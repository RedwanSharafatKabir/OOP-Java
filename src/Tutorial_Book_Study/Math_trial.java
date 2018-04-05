package Tutorial_Book_Study;
import java.util.Scanner;
public class Math_trial {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        System.out.println(Math.PI);
        System.out.println(Math.abs(s.nextDouble()));
        System.out.println(Math.sqrt(s.nextInt()));
        System.out.println(Math.pow(s.nextInt(),s.nextInt()));
        System.out.println(Math.log(s.nextInt()));
        System.out.println(Math.exp(s.nextInt()));
        System.out.println(Math.max(s.nextDouble(),s.nextDouble()));
        System.out.println(Math.min(s.nextDouble(),s.nextDouble()));
        System.out.println(Math.ceil(s.nextDouble()));
        System.out.println(Math.floor(s.nextDouble()));
    }
}
