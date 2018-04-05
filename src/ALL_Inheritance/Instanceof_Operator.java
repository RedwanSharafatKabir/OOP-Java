package ALL_Inheritance;
import java.util.*;

public class Instanceof_Operator {
}

class President extends Instanceof_Operator{
}

class Supreme_Leader extends President{
}

class final_test{
    public static void main(String args []){
        Scanner input = new Scanner (System.in);
        
        Instanceof_Operator o1 = new Instanceof_Operator();
        President o2 = new President();
        Supreme_Leader o3 = new Supreme_Leader();
        
        System.out.println("A person can be a simple person.   -  " + (o1 instanceof Instanceof_Operator));
        System.out.println("A president can be a simple person.   -  " + (o2 instanceof Instanceof_Operator));
        System.out.println("A supreme leader can be a simple person.   -  " + (o3 instanceof Instanceof_Operator));
        System.out.println("A supreme leader can be a president.   -  " + (o3 instanceof President));
        System.out.println("Any president can be a supreme leader.   -  " + (o2 instanceof Supreme_Leader));
        System.out.println("Any simple person can be a supreme leader.   -  " + (o1 instanceof Supreme_Leader));
    }
}
