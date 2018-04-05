package ALL_Static;
public class Static_variable {
    static int count = 0;
    Static_variable(){
        count++;
    }
    void total(){
        System.out.println("Total student - " + count);
    }
    public static void main(String args []){
        Static_variable obj1 = new Static_variable();
        
        Static_variable obj2 = new Static_variable();
        
        Static_variable obj3 = new Static_variable();
        obj3.total();
    }
}
