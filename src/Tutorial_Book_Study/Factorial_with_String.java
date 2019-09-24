package Tutorial_Book_Study;
import java.util.*;
public class Factorial_with_String {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        long fac = 1, rem, count = 0;
        int n = s.nextInt(), i;
        
        for(i=1;i<=n;i++){
            fac*=i;
        }
        String st = Long.toString(fac);  // we can also use >> String st = fac + " "; <<
        System.out.printf("Factorial of %d in String form is = %s \n", n, st);
        
        char [] ch = st.toCharArray();
        
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
