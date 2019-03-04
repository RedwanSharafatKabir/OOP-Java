package ALL_Static;

public class Static_variable_and_method {
    static int a = 2, b = 1;
    static void test(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static{
        a=a*2;
        b=a*2;
    };
    public static void main(String args[]){
        Static_variable_and_method.test(2);
        // test(2);
    }
}
