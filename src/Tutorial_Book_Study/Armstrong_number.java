package Tutorial_Book_Study;
import java.util.Scanner;
public class Armstrong_number {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
            int temp,i,sum=0,x = input.nextInt();
            temp = x;
            while(x!=0){
                i = x%10;
                sum+=Math.pow(i,3);
                x/=10;
            }   
            System.out.println((sum==temp)?"Armstrong Number.":"Not an Armstrong Number.");
            input.close();
        }
}