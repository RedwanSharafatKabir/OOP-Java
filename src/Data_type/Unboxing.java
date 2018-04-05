package Data_type;

public class Unboxing {
    public int addition(int a,int b){
        return a+b;
    }
    public static void main(String args []){
        Integer x = 10,y = 2;
        Unboxing obj = new Unboxing();
        System.out.println(obj.addition(x,y));
    }
}
