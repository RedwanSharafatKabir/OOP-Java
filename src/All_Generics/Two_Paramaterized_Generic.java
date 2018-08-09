package All_Generics;
import java.util.Scanner;

public class Two_Paramaterized_Generic<X,Y> {
    private X x;
    private Y y;
    
    public Two_Paramaterized_Generic(X x,Y y){
        this.x = x;
        this.y = y;
    }
    public X getX(){
        return x;
    }
    public Y getY(){
        return y;
    }
    
    public void showType(){
        System.out.println("Type of T : "+x.getClass().getName()+" and value of T is : "+x);
        System.out.println("Type of V : "+y.getClass().getName()+" and value of V is : "+y);
    }
    public static void main(String args []){
        Scanner s= new Scanner(System.in);
        
        Two_Paramaterized_Generic<String, String>obj1 = new Two_Paramaterized_Generic(s.next(),s.next());
        obj1.showType();
        
        Two_Paramaterized_Generic<String, Integer>obj2 = new Two_Paramaterized_Generic(s.next(),s.nextInt());
        obj2.showType();
    }
}
