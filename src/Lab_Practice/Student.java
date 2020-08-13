// package Lab_Practice;
import java.util.*;
public class Student {
    public String grade;
    public void setValue(String num){
        grade = num;
    }
    public String getValue(){
        return grade;
    }
    public static void main(String[] args){
        Student Sharafat = new Student();
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        if(x>=80){
            Sharafat.setValue("A+");
        }
        else if(x<80){
            Sharafat.setValue("B+");
        }
        System.out.println(Sharafat.getValue());
    }
}
