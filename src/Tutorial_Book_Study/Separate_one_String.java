package Tutorial_Book_Study;
import java.util.*;
public class Separate_one_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        String str = null, name = "", password = "";
        System.out.print("Enter String : ");
        str = scan.nextLine();
        char ch[] = str.toCharArray();
        int specialIndex = 0;
        
        for(int i=0; i<str.length(); i++){
            if(ch[i]==' '){
                specialIndex = i;
                break;
            }
            else if(ch[i]!=' ') {
                stringBuffer.append(name + ch[i]);
            }
        }
        name = stringBuffer.toString();
        
        if(name.equals("hello")){
            System.out.println(name);
        }
        else {
            System.out.println("Null");
        }
        
        ////////////////////////////////////////////////////////////
        
        for(int j=specialIndex+1; j<str.length(); j++){
            stringBuffer2.append(password + ch[j]);
        }
        password = stringBuffer2.toString();
        
        if(password.equals("123456789 ")){
            System.out.println(password);
        }
        else {
            System.out.println("Null");
        }
    }
}
