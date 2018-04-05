package ALL_Static;

public class Static_block {
    static String name;
    static int id;
    static {
        System.out.println("This is from static block.");
        id  =1718737;
        name = "Redwan Sharafat Kabir.";
    }
    static void output (){
        System.out.println("\nThis is from static method.");
        System.out.println("Name - " + name + "\nID No. " + id);
    }
    public static void main(String args []){
        Static_block.output();
        System.out.println("\nThis is from main method.");
    }
}
