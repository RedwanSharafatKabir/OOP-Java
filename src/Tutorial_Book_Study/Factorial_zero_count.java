package Tutorial_Book_Study;
import java.util.*;
public class Factorial_zero_count {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), i, fac = 1, rem, count = 0;
        
        for(i=1;i<=n;i++){
            fac*=i;
        }
        System.out.printf("Factorial of %d is = %d \n", n, fac);
        
        while(fac>=0){
            rem = fac%10;
            if(rem == 0){
                count++;
            }
            else {
                break;
            }
            fac/=10;
        }
        System.out.println("Number of zero at the last of the factorial = " + count);
    }
}
