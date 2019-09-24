package Tutorial_Book_Study;
import java.util.*;
import java.math.*;
public class BigInteger_Factorial {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        BigInteger i,n,fac = new BigInteger("1");
        n = s.nextBigInteger();
        
        for(i=new BigInteger("1"); i.compareTo(n)<=0; i=i.add(BigInteger.ONE)){
            fac = fac.multiply((i));
        }
        System.out.println(fac);

//        String st = fac + "";
        String st = fac.toString();
        System.out.println(st);
        
        System.out.println(st.getClass().getName());
        System.out.println(fac.getClass().getName());
        
    }
}
