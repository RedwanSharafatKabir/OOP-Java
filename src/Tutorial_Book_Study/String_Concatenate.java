package Tutorial_Book_Study;
import java.util.Scanner;
public class String_Concatenate {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        int i, length, j;
        String st1 = s.nextLine(), st2 = s.nextLine();
        length = st1.length() + 1 + st2.length();
        char ch1[] = st1.toCharArray(), ch2[] = st2.toCharArray(), ch3[] = new char [length];
        
        for(i=0;i<st1.length();i++){
            ch3[i] = ch1[i];
        }
        
        ch3[i] = ' ';
        i++;
        
        for(j=0;i<length;j++,i++){
            ch3[i] = ch2[j];
        }
        
        System.out.println();
        System.out.println(new String(ch3));
    }
}
