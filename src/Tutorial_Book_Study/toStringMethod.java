package Tutorial_Book_Study;
import java.util.*;

public class toStringMethod {
    String name;
    int age;
    
    toStringMethod(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return "Name : "+name+"\tAge : "+age;
    }
}

class testClass {
    public static void main(String args []){
        toStringMethod obj1 = new toStringMethod("Munna",21);
        toStringMethod obj2 = new toStringMethod("Nipu",20);
        
        System.out.println(obj1);
        System.out.println("\n"+obj2);
    }
}
