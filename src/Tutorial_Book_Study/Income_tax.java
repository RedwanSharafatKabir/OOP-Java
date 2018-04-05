package Tutorial_Book_Study;
import java.util.*;
public class Income_tax {
    public double calculateTax (double income){
        double result = income/12.0;
        return result;
    }
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        System.out.print("Please enter your income : ");
        double income = s.nextDouble();
        Income_tax obj = new Income_tax();
        double tax = obj.calculateTax(income);
        
        System.out.println("Total income : " + income);
        System.out.println("Total amount of tax : " + tax);
    }
}
