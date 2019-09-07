package Tutorial_Book_Study;
import java.util.*;
public class Distinct_Word_With_HashSet {
    
    public static int countDistinctWords(String str){
        Set<String> object = new HashSet<String>();
        String[] words = str.split(" ");
        
        for(String wrd:words){
            object.add(wrd);
        }
        return object.size();
    }
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        
        System.out.println(countDistinctWords(st));
        
    }
}
