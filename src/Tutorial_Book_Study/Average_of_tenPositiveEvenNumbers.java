package Tutorial_Book_Study;

public class Average_of_tenPositiveEvenNumbers {
    public static void main(String[] args){
        int i,sum=0;
        for(i=1;i<=20;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Avegare of first ten positive even numbers : "+sum/10);
    }
}
