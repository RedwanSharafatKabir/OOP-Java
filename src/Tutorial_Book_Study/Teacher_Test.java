package Tutorial_Book_Study;
import java.util.Scanner;
public class Teacher_Test {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        Teacher t1 = new Teacher (s.nextLine(),s.nextLine(),s.nextLine());
        t1.display();
        
        Teacher t2 = new Teacher (s.nextLine(),s.nextLine(),s.nextLine());
        t2.display();
    }
}
