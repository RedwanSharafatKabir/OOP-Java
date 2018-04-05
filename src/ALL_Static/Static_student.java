package ALL_Static;
import java.util.Scanner;
public class Static_student {
    String name;
    int id;
    static String varsity = "DIU";
    Static_student(String name,int id){
        this.name = name;
        this.id = id;
    }
    void output(){
        System.out.println("Student name - " + name);
        System.out.println("Student ID - " + id);
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Static_student s1 = new Static_student(input.nextLine(),input.nextInt());
        s1.output();
        System.out.println("University - " + Static_student.varsity);
        Static_student s2 = new Static_student(input.next(),input.nextInt());
        s2.output();
        System.out.println("University - " + Static_student.varsity);
    }
}
