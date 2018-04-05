package Tutorial_Book_Study;
import java.util.Scanner;
public class Variable_length_arguments {
    void add(int ... num){
        int sum = 0;
        for(int i : num){
            sum+=i;
        }
        System.out.println("Total = " + sum);
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        Variable_length_arguments obj = new Variable_length_arguments();
        obj.add(s.nextInt());
        obj.add(s.nextInt(),s.nextInt());
        obj.add(s.nextInt(),s.nextInt(),s.nextInt());
        obj.add(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());        
    }
}
