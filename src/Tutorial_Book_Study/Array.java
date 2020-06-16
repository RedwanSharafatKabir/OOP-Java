package Tutorial_Book_Study;
import java.util.Scanner;
public class Array {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        
        int [] a = new int[100];
        int max,min,x,sum=0,i;
        System.out.print("Initialize array size : ");
        x=input.nextInt();
        for(i=0;i<x;i++){
            a[i] = input.nextInt();
        }
        min=a[0];
        for(i=1;i<x;i++){
            if(a[i]<min)
                min=a[i];
        }
        max=a[0];
        for(i=1;i<x;i++){
            if(a[i]>max)
                max=a[i];
        }
        for(i=0;i<x;i++){
            sum+=a[i];
        }
        for(int cut : a){
            System.out.print(cut+" ");
        }
        System.out.println("\nMaximum value of array : "+max);
        System.out.println("Minimum value of array : "+min);
        System.out.println("Sum of array : "+sum);
        System.out.println("Average of array : "+(sum/i));
    }
}
