package All_Generics;
import java.util.*;
public class Generic_Method__with_Enhanced_Loop {
    public static <E> void output(E[] e){
        for(E e1 : e){
            System.out.print(" "+e1);
        }
        System.out.println("\n");
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        Integer a[] = {10,20,30,40,51};
        Character c[] = {'a','b','C','D','e'};
        
        System.out.println("Integer Array: ");
        output(a);
        
        System.out.println("Character Array: ");
        output(c);
    }
}
