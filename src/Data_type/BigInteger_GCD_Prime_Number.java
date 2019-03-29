package Data_type;
import java.util.*;
import java.math.*;
public class BigInteger_GCD_Prime_Number {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        boolean prime;
        BigInteger x,y,n;
        
        x = s.nextBigInteger();
        y = s.nextBigInteger();
        n = x.gcd(y);
        
        System.out.println("GCD = " + n +"\n");
        
        prime = x.isProbablePrime(1);
        System.out.println(prime);
        if(prime==true)
            System.out.println(x+" is a prime number.");
        else
            System.out.println(x+" is not prime.");
        
        prime = y.isProbablePrime(1);
        System.out.println(prime);
        if(prime==true)
            System.out.println(y+" is a prime number.");
        else
            System.out.println(y+" is not prime.");
    }
}
