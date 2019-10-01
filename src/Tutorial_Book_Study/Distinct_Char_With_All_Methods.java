package Tutorial_Book_Study;
import java.util.*;
public class Distinct_Char_With_All_Methods {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        String st = s.nextLine();
        StringBuilder obj = new StringBuilder();
        int index, i;
        
        // Using distinct builtin function
        st.chars().distinct().forEach(ch->obj.append((char)ch));
        
        // Using indexOf
//        for (i=0;i<st.length();i++) {
//            index = st.indexOf(st.charAt(i), i+1);
//            if (index == -1) {
//                obj.append(st.charAt(i));
//            }
//        }
        
        // Using HashSet
//        Set<Character> linkedHashSet = new LinkedHashSet<>();
//        for (i=0;i<st.length();i++) {
//            linkedHashSet.add(st.charAt(i));
//        }
//        for (Character c : linkedHashSet) {
//            obj.append(c);
//        }
        
        System.out.println(obj);
    }
}
