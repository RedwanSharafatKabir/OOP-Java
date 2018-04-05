package Tutorial_Book_Study;
import java.util.Scanner;
public class Vowel_consonant{
    public static void main(String[] args){
        char ch;
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        if(ch =='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Lower Case Vowel.");
        }
        else if(ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Upper Case Vowel.");
        }
        else {
            System.out.println("Consonant.");
        }
    }
}
