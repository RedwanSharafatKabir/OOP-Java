package ALL_Inheritance;
import java.util.*;
public class Super_keyword {
    String n1,n2;
    int x = 100;
    // costructor
    Super_keyword (String n1,String n2) {
        this.n1 = n1;
        this.n2 = n2;
        System.out.println(n1+" "+n2);
    }
    void output(int a){
        System.out.println(a + " from Super class.");
        System.out.println("Constructor from Super class is giving tips : "+(a*a)+" + $"+x);
    }
}
class Super_keyword_test extends Super_keyword {
    String a1,a2;
    int m = 0;
    Super_keyword_test (String a1,String a2) {
        // super class constructor
        super("Shonargoan","Redison");
        System.out.println(a1+" "+a2);
    }
    @Override
    void output(int b){
        // super class method
        super.output(9);
        System.out.println(b + " from Sub class.");
        System.out.println("Constructor from Sub class is unable to give tips : "+m);
    }
    void display(int x){
        // super class variable
        System.out.println(x + " + " + super.x + " = " + (x + super.x));
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);        
        Super_keyword_test obj = new Super_keyword_test("Sheraton","Westine");
        obj.display(s.nextInt());
        obj.output(10);
    }
}
