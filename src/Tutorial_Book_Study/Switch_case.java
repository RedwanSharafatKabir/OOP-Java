package Tutorial_Book_Study;
import java.util.Scanner;
public class Switch_case {
    public static void main(String args []){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    switch(x){
        case 31:
            System.out.println("Thirty One.");
            break ;
        case 32:
            System.out.println("Thirty Two.");
            break ;
        case 33:
            System.out.println("Thirty Three.");
            break ;
        case 34:
            System.out.println("Thirty Four.");
            break ;
        case 35:
            System.out.println("Thirty Five.");
            break ;
        case 36:
            System.out.println("Thirty Six.");
            break ;
        default :
            System.out.println("Invalid.");
    }
    }
}
