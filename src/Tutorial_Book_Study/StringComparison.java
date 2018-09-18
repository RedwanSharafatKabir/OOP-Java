package Tutorial_Book_Study;
import java.util.*;

public class StringComparison {
    
    public static void main(String args []){
        String pass1 = "A01997";
        String pass2 = "A01997";
        String pass3 = new String("a01997");
        String pass4 = new String("A01997");
        
        System.out.println(pass1==pass3);       // "==", "reference of object" ke compare kore
        System.out.println(pass1.equals(pass3));        // equals "value/content" ke compare kore
        System.out.println(pass2.equalsIgnoreCase(pass3));   // equalsIgnoreCase case sensitive na
        System.out.println(pass3.equals(pass4));
    }
}
