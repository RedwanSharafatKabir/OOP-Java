package Tutorial_Book_Study;
import java.util.*;
public class Word_Count_with_split_method {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
          return 0;
        }
        
        //    \\S+ means remove ll spaces or replace all spaces
        String[] words = input.split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i;
        s.nextLine();

        for(i=1;i<=n;i++){
            String st = s.nextLine();
            System.out.println(countWords(st));
        }
    }  
}
