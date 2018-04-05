package Final_keyword;

// final public class Final_method {  //  final class can not be inherited
public class Final_method {
    final void display(){   // final method can be inherited but not be overrided
        System.out.println("DIU");
    }
}
class student extends Final_method {
//    @Override
    void display2(){
        System.out.println("Redwan.");
    }
}
class test1 {
    public static void main(String args []){
        student obj = new student ();
        obj.display();
        obj.display2();
    }
}
