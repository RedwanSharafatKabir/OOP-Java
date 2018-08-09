package All_Generics;
import java.util.*;

public class Basic_Generic_Class<T> {
    T obj;

    public Basic_Generic_Class(T obj){
        this.obj=obj;
    }
    public T getobj(){
        System.out.println("Input was: "+obj);
        return obj;
    }
    public void output(){
        System.out.println("Type of T is: "+obj.getClass().getName());
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        Basic_Generic_Class<Integer>n = new Basic_Generic_Class(s.nextInt());
        n.output();
        n.getobj();
    }
}
