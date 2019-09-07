package Tutorial_Book_Study;
import java.util.*;
public class WordCount_in_a_Sentence { 
    public static int wordcount(String st){
        int count = 0, i;
        char ch[]= st.toCharArray();
        
        for(i=0;i<st.length();i++){
            
            count = (i == 0) ? ((ch[0] != ' ') ? count+1 : count) : (( ch[i] != ' ' && ch[i-1] == ' ' )) ? count+1 : count ;
            
//            if(i==0){
//                if(ch[0] != ' '){
//                    count++;
//                }
//            }
//            else {
//                if( ch[i] != ' ' && ch[i-1] == ' ' ){
//                    count++;
//                }
//            }
        }
        return count;
    }  
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt(), i;
      s.nextLine();
      
      for(i=1;i<=n;i++){
          String st = s.nextLine();
          System.out.println(wordcount(st));
      }
  }  
}
