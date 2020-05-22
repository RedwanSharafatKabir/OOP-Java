package Tutorial_Book_Study;
import java.util.*;

public class String_tokenize {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(s.nextLine()," ");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
