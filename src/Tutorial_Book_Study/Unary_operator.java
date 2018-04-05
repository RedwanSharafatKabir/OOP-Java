package Tutorial_Book_Study;
import java.util.*;
public class Unary_operator {
    public static void main(String[] args){
        int a,result;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        result = +a;
        System.out.println("Unary Plus : " + result);
        result = -a;
        System.out.println("Unary Minus : " + result);
        result = a++;
        System.out.println("Increment operator(Postfix) : " + result);  //  a, then a+1
        result = ++a;
        System.out.println("Increment operator(Prefix) : "  + result);  //  ((a+1) + 1)
        result = a--;
        System.out.println("Decrement operator(Postfix) : " + result);  //  ((a+1) + 1), then ((a+1) + 1) - 1
        result = --a;
        System.out.println("Decrement operator(Prefix) : "  + result);  //  ((((a+1) + 1) - 1) - 1)
    }
}
