package Data_type;

public class Autoboxing {
    public Integer addition(Integer a,Integer b){
        return a+b;
    }
    public static void main(String args []){
        int x = 10,y = 2;
        Autoboxing obj = new Autoboxing();
        System.out.println(obj.addition(x,y));
    }
}
