
/// generic subtyping

package All_Generics;
import java.util.*;
public class Container<T> {
    
    private static final int MAX_LENGTH = 10;
    
    private T[] items;
    private int currentIndex = 0;
    
    public void Generics_Subtyping(){
        items = (T[]) new Object[MAX_LENGTH];
    }
    
    public void add(T item){
        if(currentIndex < MAX_LENGTH){
            items[currentIndex++] = item;
        }
        else{
            System.out.println("Container is full.");
        }
    }
    
    public T getItem(int index){
        if(index > MAX_LENGTH){
            throw new IllegalArgumentException("Index can not be larger than MAX");
        }
        return items[index];
    }
    
    public void printAll(){
        for(int i=0;i<currentIndex;i++){
            System.out.print(items[i]+" , ");
        }
        System.out.println();
    }
    
    public static void main(String args []){
        Container<Integer>container = new Container<Integer>();
        container.add(1);
        container.add(2);
        
        container.printAll();
    }
}
