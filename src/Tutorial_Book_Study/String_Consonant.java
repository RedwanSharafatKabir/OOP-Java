package Tutorial_Book_Study;
import java.util.Scanner;
import java.util.StringTokenizer;
public class String_Consonant {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        String st = s.nextLine();
        int i, count = 0;
        char ch[] = st.toCharArray();
        
        for(i=0;i<st.length();i++){
            if( Character.isLetter(ch[i]) && ((ch[i]!='a'&&ch[i]!='A') && (ch[i]!='e'&&ch[i]!='E')
                     && (ch[i]!='i'&&ch[i]!='I') && (ch[i]!='o'&&ch[i]!='O') && (ch[i]!='u'&&ch[i]!='U')) ){
                
                count++;
            }
        }
        System.out.println(count);
    }
}
