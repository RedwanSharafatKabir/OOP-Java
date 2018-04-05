package ALL_Inheritance;
import java.util.Scanner;
public class Inheritance {
    String name,id;
    void display1 (){
        System.out.println("Name : "  + name + "\nID : " + id);
    }
}
class Inheritance_test extends Inheritance {
    String qualification ;
    
    void display2 () {
        display1 ();
        System.out.println("Educational Qualification : " + qualification);
    }
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        Inheritance_test obj = new Inheritance_test() ;
        obj.name = input.nextLine();
        obj.id = input.nextLine();
        obj.qualification = input.nextLine();
        
        obj.display2();
    }
}