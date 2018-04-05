package Tutorial_Book_Study;
import java.util.Scanner;
public class Addition {
    double add(double a,double b){
        double sum = a+b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        double a=S.nextDouble();
        double b=S.nextDouble();
        Addition x = new Addition();
        System.out.println(x.add(a,b));
    }
}