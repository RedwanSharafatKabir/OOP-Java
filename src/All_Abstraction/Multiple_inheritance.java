package All_Abstraction;

public interface Multiple_inheritance {
    public abstract void play();
}
interface i extends Multiple_inheritance {
    @Override
    public void play();
}
class you implements Multiple_inheritance,i {
    @Override
    public void play(){
        System.out.println("Hello !");
    }
    public static void main(String args []){
        you o = new you();
        o.play();
    }
}
