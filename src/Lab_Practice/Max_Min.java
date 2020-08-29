// package Lab_Practice;
import java.util.*;
public class Max_Min {
    static void max (int x, int y){
        if(x>y){
            System.out.println("Maximum Number : " + x);
        }
        if(y>x){
            System.out.println("Maximum Number : " + y);
        }
    }
    static void min (int x, int y){
        if(x<y){
            System.out.println("Minimum Number : " + x);
        }
        if(y<x){
            System.out.println("Minimum Number : " + y);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        max(a,b);
        min(a,b);
        
    }
}
