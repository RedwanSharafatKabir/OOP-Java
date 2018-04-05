package ALL_Exception_Handling;
import java.util.*;
public class Problem_solving_Exception {
    public static void main(String args []){
        int count = 0;
        do{
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("\nPlease Enter a num1 : ");
                int a = input.nextInt();
                System.out.print("Please Enter a num2 : ");
                int b = input.nextInt();
                double devide = a/b;
                System.out.println("Result: " + a + "/" + b + " = " + devide);
                count = 1;
            }catch(Exception obj){
                System.out.println("=========================================================");
                System.out.println("Exception: " + obj + "\nYou must enter valid integer. Please try again");
                System.out.println("=========================================================");
            }
        }while(count == 0);
    }
}
