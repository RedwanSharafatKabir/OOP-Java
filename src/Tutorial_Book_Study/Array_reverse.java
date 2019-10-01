package Tutorial_Book_Study;
import java.util.Scanner;

public class Array_reverse {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, j, temp, ar [] = new int [n];
        
        for(i=0;i<ar.length;i++){
            ar[i] = s.nextInt();
        }
        
        j=ar.length-1;
        for(i=0;i<=ar.length/2;i++){
            temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            j--;
        }
        
        for(i=0;i<ar.length;i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
