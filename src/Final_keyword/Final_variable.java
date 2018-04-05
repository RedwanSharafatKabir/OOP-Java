package Final_keyword;

public class Final_variable {
    final String name = "DIU"; // final keyword
    int fee ;  // blank final keyword
    static final int stu ; // static blank final keyword
    static {
        stu = 25000;
    }
    Final_variable(int fee){
        this.fee = fee;
    }
    void display(){
        System.out.println(name + " has " + stu + " students.");
        System.out.println("Each of them pays " + fee + " tk.");
    }
}
class test {
    public static void main(String args []){
        Final_variable obj = new Final_variable (750000);
        obj.display();
    }
}