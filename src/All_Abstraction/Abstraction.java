package All_Abstraction;

//abstract k shob shomoy class extends kore
//abstract class
abstract public class Abstraction {
    void phone1 (){
        System.out.println("I use Lumia");
    }
    void phone2 (){
        System.out.println("I use Xiomi");
    }
    // abstract method
    abstract void sendMessage();
}
class Sharafat extends Abstraction {
    @Override
    void sendMessage(){
        System.out.println("Hi ! this is Sharafat");
    }
}
class Ayon extends Abstraction {
    @Override
    void sendMessage(){
        System.out.println("\nHi ! this is Ayon Locha");
    }
}
class test_abstract {
    public static void main(String args []){
        Abstraction o;    // reference variable
        
        o = new Sharafat();
        o.sendMessage();
        o.phone1();
        o = new Ayon();
        o.sendMessage();
        o.phone2();
    }
}
