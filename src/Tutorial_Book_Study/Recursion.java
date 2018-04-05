package Tutorial_Book_Study;
import java.util.Scanner;
public class Recursion {
    int fact(int n){
        if(n==1)
            return 1;
        else 
            return n*fact(n-1);
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        Recursion obj = new Recursion();
        int x = s.nextInt();
//        obj.fact(x);
        System.out.println(x + " ! = " + obj.fact(x));
    }
}
