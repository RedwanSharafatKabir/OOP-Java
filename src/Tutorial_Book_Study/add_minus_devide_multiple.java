package Tutorial_Book_Study;
import java.util.Scanner;
public class add_minus_devide_multiple {
    public static void main(String[] args)
    {
    Scanner input  = new Scanner(System.in);
    double a=input.nextDouble();
    double b=input.nextDouble();
    double sum=a+b,minus=a-b,devision=a/b,multiple=a*b;
    System.out.println("Addition : " + sum);
    System.out.println("Subtraction : " + minus);
    System.out.println("Division : " + devision);
    System.out.println("Multiplication : " + multiple);
    }
}