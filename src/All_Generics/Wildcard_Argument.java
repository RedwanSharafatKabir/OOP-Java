package All_Generics;

import java.util.*;

public class Wildcard_Argument {
    
    public static void print(List<?> l){
        /*  <?> etake bole "wildcard argument"
            jodi ekhane <Object> use kortam tahole 27 number line e compilation error dekhato,
            karon "print()" method only argument hishebe "List<Object>" ke nibe,
            "List<String>" othoba "List<Integer>" ke nibe na    */
        
        for(Object o : l){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    
    public static void main(String args []){
        
        List<Object> obj = new ArrayList<>();
        obj.add(new Integer(56));
        print(obj);
        
        List<String> str = new ArrayList<>();
        str.add("Good");
        print(str);
        
    }
}
