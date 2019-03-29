package Data_type;
import java.util.*;
import java.math.*;
public class BigInteger_Factorial {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        BigInteger x,i,j=new BigInteger("1");
        x = s.nextBigInteger();
        
        for(i=new BigInteger("1"); i.compareTo(x)<=0;i=i.add(BigInteger.ONE)){
            j = j.multiply((i));
        }
        System.out.println(j);
    }
}
