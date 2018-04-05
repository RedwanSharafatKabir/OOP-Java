package Data_type;

public class overflow_underflow {
    public static void main(String [] args){
        long y = Long.MAX_VALUE;
        int a = Integer.MAX_VALUE, b= 525, m=2 , n=3;
        
        System.out.println(a + "\t\t\tMaximum value of integer");
        System.out.println((a+b) + "\t\t\tOverflow");
        System.out.println((a-b) + "\t\t\tGeneral");
        System.out.println((m/n) + "\t\t\t\tUnderflow");
    }
}
