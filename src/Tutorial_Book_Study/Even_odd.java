package Tutorial_Book_Study;
import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        if(input.nextInt()%2==0){
            System.out.println("Even.");
        }
        else {
            System.out.println("Odd.");
        }
    }
}
