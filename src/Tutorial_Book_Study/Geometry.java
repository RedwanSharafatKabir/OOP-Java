package Tutorial_Book_Study;
import java.util.Scanner;
public class Geometry {
    double rec (double l, double w){
        double A= l*w;
        return A;
    }
    double cir (double r){
        double A = r* Math.PI;
        return A;
    }
    double tr (double b, double h){
        double A= 0.5*b*h;
        return A;
    }
    double sq (double a){
        return a*a;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x,a,b;
        System.out.print("Select Gemetric Eqation : ");
        Geometry sharafat = new Geometry();
        x = input.nextDouble();
        if(x==1){
            a = input.nextDouble();
            b = input.nextDouble();
            System.out.printf("Area of Rectangular is %.2f\n", sharafat.rec(a,b));
        }
        if(x==2){
            a = input.nextDouble();
            System.out.printf("Area of Circle is %.2f\n", sharafat.cir(a));
        }
        if(x==3){
            a = input.nextDouble();
            b = input.nextDouble();
            System.out.printf("Area of Triangle is %.2f\n", sharafat.tr(a,b));
        }
        if(x==4){
            a = input.nextDouble();
            System.out.printf("Area of Square is %.2f\n", sharafat.sq(a));
        }
    }
}
