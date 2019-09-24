package Tutorial_Book_Study;
import java.util.*;
import java.math.*;

public class Factorial_of_Very_Large_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        BigInteger fac = BigInteger.ONE;
        int n = s.nextInt(), i, count = 0;
        
        for (i=1;i<=n;i++) {
            fac = fac.multiply(new BigInteger(String.valueOf(i)));     
        }
        System.out.println(fac);
        System.out.println(fac.getClass().getName());
        
        String st = fac.toString();
        System.out.println("Factorial as String = " + st);
        
        char ch[] = st.toCharArray();
        for(i=(st.length()-1);i>=0;i--){
            if(ch[i] == '0'){
                count++;
            }
            else {
                break;
            }
        }
        System.out.println("Number of zero at the last of the factorial = " + count);
    }
}
