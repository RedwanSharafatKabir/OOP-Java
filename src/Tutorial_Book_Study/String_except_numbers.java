package Tutorial_Book_Study;
import java.util.Scanner;
public class String_except_numbers {
    public static void main(String args []){
        Scanner s = new Scanner (System.in);
        
        int i;
        String st = s.nextLine();
        char ch1[] = st.toCharArray(), ch2[] = new char [100];
        
        for(i=0;i<st.length();i++){
            if(Character.isLetter(st.charAt(i))){
                ch2[i] = ch1[i];
            }
        }
        
        System.out.println(new String(ch2));
    }
}
