package Tutorial_Book_Study;
import java.util.*;
public class ArraySort {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), ar[] = new int [n], count = 0;
        for(int i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        
        Arrays.sort(ar);
        
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
        }
        System.out.println("");
    }
}
