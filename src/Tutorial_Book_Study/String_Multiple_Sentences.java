package Tutorial_Book_Study;
import java.util.*;
public class String_Multiple_Sentences {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(), i;
        String []st = new String[n];
        s.nextLine();
        
        for(i=0;i<st.length;i++){
            st[i] = s.nextLine();
        }
        
        for(String str: st){
            System.out.println(str);
        }
    }
}
