package Tutorial_Book_Study;
import java.util.Scanner;
public class Temperature {
    double temp(double F)
    {
        double C=((F-32)/9)*5;
        return C;
    }
    public static void main(String[] args)
    {
        Scanner f = new Scanner(System.in);
        System.out.print("What is the temperature in Farenhite ? ");
        double F=f.nextDouble();
        Temperature munna=new Temperature();
        //double x = munna.temp(F);
        System.out.printf("Temperature in Celcius is : %.2f\n", munna.temp(F));
    }
}