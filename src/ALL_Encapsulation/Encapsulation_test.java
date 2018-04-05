package ALL_Encapsulation;
import java.util.Scanner;
public class Encapsulation_test {
    
    public static void main(String args []){
        Scanner input = new Scanner (System.in);
        Encapsulatiopn_set_get obj = new Encapsulatiopn_set_get();
        
        obj.set_name("Redwan Sharafat");
        obj.set_ID(8737);
        obj.set_age(21);
        
        System.out.println("Name : " + obj.get_name());
        System.out.println("ID No. " + obj.get_ID());
        System.out.println("Age : " + obj.get_age());
    }
}
