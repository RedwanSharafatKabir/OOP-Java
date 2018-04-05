package ALL_Inheritance;
public class Overriding {
    String name,id ;
    void display (){
        System.out.println("\nFrom first method \nName : "  + name + "\nID : " + id);
    }
}
// without inheritence we can not override methods
class Overriding_test extends Overriding {
    String qualification ;
    // Overriding method
    @Override
    void display (){
        System.out.println("Name : "  + name + "\nID : " + id + "\nEducational Qualification : " + qualification);
    }
    public static void main(String args []){
        
        Overriding_test obj1 = new Overriding_test();
        obj1.name = "Redwan";
        obj1.id = "171";
        obj1.qualification = "BSc.";
        System.out.println("From overridden method");
        // overridden method
        obj1.display();
        
        Overriding obj2 = new Overriding() ;
        obj2.name = "Sharafat";
        obj2.id = "15";
        // first method
        obj2.display();
    }
}
