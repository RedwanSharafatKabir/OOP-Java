package Tutorial_Book_Study;
import java.util.HashMap;
import java.util.Scanner;
public class String_character_count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str = null;
        System.out.println("Enter String : ");
        str = scan.nextLine();

        int[] count = new int[255];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            count[str.charAt(i)]++;
        }
        char[] ch = new char[str.length()];
        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]){
                    find++;
                }
            }
            if (find == 1) {
                System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
            }
        }
        
        
        // Using HashMap
//        String str = scan.nextLine();
//        int i;
//        HashMap <Character, Integer> hMap = new HashMap<>();
//        for (i=str.length()-1; i>=0; i--) {
//           if (hMap.containsKey(str.charAt(i))) {
//              int count = hMap.get(str.charAt(i));
//              hMap.put(str.charAt(i), ++count);
//           } else {
//              hMap.put(str.charAt(i),1);
//           }
//        }
//        System.out.println(hMap);
    }
}
