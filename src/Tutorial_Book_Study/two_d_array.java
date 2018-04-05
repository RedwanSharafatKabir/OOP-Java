package Tutorial_Book_Study;
import java.util.*;
public class two_d_array {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int [][]a=new int [100][100];
        int x,y,i,j;
        System.out.print("Initialize array size : ");
        x=input.nextInt();
        y=input.nextInt();
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                a[i][j]=input.nextInt();
            }
        }
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
