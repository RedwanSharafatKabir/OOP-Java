package Tutorial_Book_Study;
import java.text.DecimalFormat;
import java.util.*;
public class Cricket_Run_Rate {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        double or, pr, rb, crr, rrr;
        String st1, st2;
//        DecimalFormat obj = new DecimalFormat("#.##");
        System.out.println("Match Between ? ");
        st1 = s.next();
        System.out.println("VS");
        st2 = s.next();
        System.out.println("\n----------------------Scoreboard----------------------");
        
        System.out.print(st1 + "'s Run: ");
        or = s.nextDouble();
        System.out.print(st2 + "'s Run: ");
        pr = s.nextDouble();
        System.out.print("Rest of Balls: ");
        rb = s.nextDouble();
        
        crr = pr/((300-rb)/6);
        rrr = (((or+1)-pr)*6)/rb;
        
//        System.out.print("\n\nCurrent Run Rate: " + obj.format(crr) + "         ");
//        System.out.println("Required Run Rate: " + obj.format(rrr) + "\n\n");
        System.out.printf("Current Run Rate: %.2f           ", crr);
        System.out.printf("Required Run Rate: %.2f\n", rrr);
        
        System.out.printf("%s needs %d runs in %d balls to win\n", st2, (int)((or+1)-pr), (int)rb);
    }
}
