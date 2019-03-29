package Data_type;
import java.util.*;
import java.math.*;
public class BigInteger_For_LOOP {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        BigInteger x,i;
        x = s.nextBigInteger();
        for(i=BigInteger.ONE; i.compareTo(x)<=0;i=i.add(BigInteger.ONE)){
            System.out.println(i);
        }
    }
}
