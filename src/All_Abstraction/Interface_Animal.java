package All_Abstraction;

public interface Interface_Animal {
    public abstract void eat();
}
class dog implements Interface_Animal {
    @Override
    public void eat(){
        System.out.println("Dogs eat egg");
    }
}
class test_animal {
    public static void main(String args []){
        Interface_Animal o;
        o = new dog();
        o.eat();
    }
}
