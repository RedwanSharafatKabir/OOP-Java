package ALL_Exception_Handling;
public class Basic_Exception_Handling {
    public static void main(String args []){
        try {
            int ar[] = new int [5];
            ar[5] = 25;
            System.out.println("Result = " + ar[5]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException obj){
            System.out.println("Exception Alert : " + obj);
        }
        finally{
            System.out.println("This is fun.");
        }
    }
}
