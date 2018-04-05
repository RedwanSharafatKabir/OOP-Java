package ALL_Static;

public class Static_Method {
    static String name = "Redwan Sharafat Kabir.", id = "171-15-8737";
    void output1(){
        output2();
        System.out.println("Name - " + name + "\nID - " + id);
    }
    static void output2(){
        System.out.println("Name - " + name + "\nID - " + id);
    }
    public static void main(String args []){
        Static_Method obj = new Static_Method();
        obj.output1();
        
        Static_Method.output2();
    }
}
