package Tutorial_Book_Study;
import java.util.Scanner;
public class Box_Volume_test {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        Box_Volume obj1 = new Box_Volume(s.nextDouble(),s.nextDouble(),s.nextDouble());
            obj1.display();
        Box_Volume obj2 = new Box_Volume(s.nextDouble(),s.nextDouble(),s.nextDouble());
            obj2.display();
    }
}
