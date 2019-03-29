package Data_type;
import java.util.*;
import java.math.*;
public class BigInteger_Math_And_While_LOOP {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        BigInteger a,b;
        BigInteger X1 = BigInteger.TEN;
        BigInteger X2 = BigInteger.ONE;
        BigInteger X3 = BigInteger.ZERO;
        
        a=s.nextBigInteger();
        b=s.nextBigInteger();
        
        System.out.println("Summation " + a.add(b));
        System.out.println("Subtraction " + a.subtract(b));
        System.out.println("Multiplication " + a.multiply(b));
        System.out.println("Division " + a.divide(b));
        System.out.println("Remainder " + a.remainder(b));
        System.out.println("Abs value of a " + a.abs());
        System.out.println("Abs value of b " + b.abs());
        
        if(a.compareTo(new BigInteger("99999"))>=0){
            System.out.println("Large.");
        }
        System.out.println(X1);
        System.out.println(X3);
        while(X2.compareTo(new BigInteger("20"))<=0){
            System.out.println(X2);
            X2 = X2.add(BigInteger.ONE);
        }
    }
}
