package All_Generics;
import java.util.Scanner;

public class Generic<T> {   // T is a type parameter
    private T obj;
    
    public Generic(T obj){
        this.obj=obj;
    }
    public T getobj(){
        return obj;
    }
    public void showType(){
        System.out.println("Type of T is : " + obj.getClass().getName());
    }
}
class GenericTest {
    public static void main(String [] args){
        Scanner m = new Scanner (System.in);
        
        Generic<Integer>obj1;    // replace with integer type
        obj1 = new Generic(m.nextInt());
        obj1.showType();
        int x = obj1.getobj();
        System.out.println("Value of T : " + x);
        
        Generic<String>obj2;    // replace with String type
        obj2 = new Generic("This is a Generic Class");
        obj2.showType();
        String y = obj2.getobj();
        System.out.println("Meaning of T : " + y);
    }
}
