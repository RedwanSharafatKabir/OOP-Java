package Tutorial_Book_Study;
import java.util.Scanner;

public class String_newLine_words {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        int i;
        String st1 = s.nextLine();
        char ch1[] = st1.toCharArray();
        
        System.out.print(ch1[0]);
        
        for(i=1;i<st1.length();i++){
            if(ch1[i] == ' '){
                System.out.println();
            }
            else {
                System.out.print(ch1[i]);
            }
        }
        System.out.println();
    }
}
