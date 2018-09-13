
// generic subtyping

package All_Generics;

public class Container<T> {
    
    private static final int MAX_LENGTH = 10;
    
    private T [] items;
    private int currentIndex;
    
    @SuppressWarnings("unchecked")          // ai annotation dile kno error dekhabe na.
    
    public Container(){
//	items = new T[max];              // ai ta kora jabe na. ai jonno nicher ai way. but, warning dibe.
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
            // aita runtimeException (Unchecked Exception)
        }
        return items[index];
    }
    
    public void printAll(){
        for(int i=0;i<currentIndex;i++){
            System.out.print(items[i]+" ");
        }
        System.out.println();
        for(Object i : items) {         // amra jani j shob (class, type & object) er super class "Object"
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String args []){
        Container<Integer>container = new Container<Integer>();
        container.add(1);
        container.add(2);
        
	System.out.println(container.getItem(1));
        
        container.printAll();
    }
}


/*
   jodi akta class "Foo" onno akta class "Bar" er subclass hoy, taile "Foo" er generic class kono vabe e "Bar" er
   Generic class er subclass noy.

 * Bar b = new Foo();                                                           // aita possible
 * Object o = new String();							// aita possible
 * Container <Bar> b = new Container<Foo>(); 		// but, aita possible na
 * Container <Object> b = new Container<String>(); 	// but, aita possible na

*/
