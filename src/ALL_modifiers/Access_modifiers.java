package ALL_modifiers;

public class Access_modifiers { 
    public String name;
    private int id,age;
    protected String cgpa;
    
    public void display_name(){
        System.out.println("Name : Redwan Sharafat");
    }
    
    public void set_ID(double x){
        int y = (int)x;    // "explicit type custing" (upper type to lower type custing)
                           // "implicit type custing" (lower type to upper type custing)
        id = y;
    }
    public void get_ID(){
         System.out.println("ID No. " + id);
        
    }
    public void set_age(int age){
         this.age = age;
    }
    public void get_age(){
         System.out.println("Age : " + age);
    }
    
    public void display_cgpa(){
        System.out.println("SGPA / CGPA : 4.00");
    }
}
