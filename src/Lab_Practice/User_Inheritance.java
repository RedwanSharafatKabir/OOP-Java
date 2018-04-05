package Lab_Practice;
public class User_Inheritance {
    String userid,password;
    User_Inheritance (String userid,String password){
        this.userid = userid;
        this.password = password;
    }
    void display1 (){
        System.out.println ("User ID : " + userid + "\n" + "Password : " + password) ;
    }
}
class Customer extends User_Inheritance{
    String name,email;
    Customer (String name,String email){
        super(" "," ");
        this.name = name;
        this.email = email;
    }
    void display3 (){
        System.out.println ("Name : " + name + "\n" + "Email : " + email) ;
    }
    public static void main(String[] args){
        Customer a1 = new Customer ("Sharafat","15-8737@diu.edu.bd") ;
        User_Inheritance a2 = new User_Inheritance ("8737" , "********") ;
        Item a3 = new Item ("Asus Desktop." , 2000.00) ;
        
        a1.display3 () ;
        a2.display1();
        a3.display2();
    }
}
