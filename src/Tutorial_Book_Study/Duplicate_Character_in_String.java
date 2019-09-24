package Tutorial_Book_Study;
import java.util.*;
public class Duplicate_Character_in_String {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        int count = 0, i;
        String st = s.nextLine();
        char ch [] = st.toCharArray(), temp;
        temp = s.next().charAt(0);

        for(i=0;i<st.length();i++){
            if(temp == ch[i]){
                count++;
            }
        }
        if(count>0){
            System.out.println("Occurrence of '" + temp + "' in " + st + " = " + count);
        }
        else {
            System.out.println("'" + temp + "' is not present");
        }
    }
}
