package ALL_Inheritance;
import java.util.Scanner;
public class Inheritance_and_Encapsulation {
    private String name,id;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}

class Inheritance_and_Encapsulation_test extends Inheritance_and_Encapsulation {
    private String qualification ;
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
    void display(){
        System.out.println("\nName : "+getName()+"\nID : "+getId()+"\nEducational Qualification : "+getQualification());
    }
}

class test {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        Inheritance_and_Encapsulation_test obj = new Inheritance_and_Encapsulation_test() ;
        
        obj.setName(input.nextLine());
        obj.setId(input.nextLine());
        obj.setQualification(input.nextLine());
//        System.out.println("\nName : "  + obj.getName() + "\nID : " + obj.getId() + "\nEducational Qualification : " + obj.getQualification());
        obj.display();
    }
}