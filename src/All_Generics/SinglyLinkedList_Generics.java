package All_Generics;

import java.util.*;

public class SinglyLinkedList_Generics <T> {
    
    private long size;
    private node<T> head;
    private node<T> tail;
    
    public void add1(T value){
        add1(new node<> (value));
    }
    public void add2(T value){
        add2(new node<>(value));
    }
    
    private void add2(node<T> n){
        if(size==0){
            head = n;
        }
        else {
            tail.setNext(n);
        }
        tail = n;
        size++;
    }
    
    public void add1(node<T> n){
        node<T> temp = head;
        head = n;
        head.setNext(temp);
        
        size++;
        
        if(size==1){
            tail = head;
        }
    }
    
    public node<T> getHead(){
        return head;
    }
    public node<T> getTail(){
        return tail;
    }
    
    public void remove1(){
        if(size!=0){
            head = head.getNext();
        }
        size--;
        if(size==0){
            tail = null;
        }
    }
    public void remove2(){
        if(size!=0){
            if(size==1){
                head = null;
                tail = null;
            }
            else {
                node<T> current = head;
                while(current.getNext()!=tail){
                    current = current.getNext();
                }
                current.setNext(null);
                tail = current;
            }
            size--;
        }
    }
    
    public T get1(){
        return getHead().getValue();
    }
    
    /*  four scenario
            1. empty list-  do nothing
            2. single node : ( previous is null)
            3. Many nodes
                a. node to remove is first node
                b. node to remove is the middle or last   */
    
    public boolean remove(T type) {
        node<T> prev = null;
        node<T> current = head;
        
        while(current!=null){
            if(current.getValue().equals(type)){
                if(prev!=null){
                    prev.setNext(current.getNext());
                    if(current.getNext()==null){
                        tail=prev;
                    }
                    size--;
                }
                else {
                    remove1();
                }
                return true;
            }
            prev = current;
            current = current.getNext();
        }
        return false;
    }
    public long getSize(){
        return size;
    }
    public void print(){
        System.out.print("Total elements : "+size+" -> ");
        node n = head;
        while(n!=null){
            System.out.print(n.getValue().toString()+" ");
            n = n.getNext();
        }
        System.out.println();
    }
    public void clear(){
        for(node<T> x = head;x!=null;){
            x.next=null;
            x.value=null;
        }
        head = tail = null;
        size = 0;
    }
    
    private class node<T> {
        private T value;
        private node<T> next;
        
        public node(T value){
            this.value = value;
        }
        public T getValue(){
            return value;
        }
        public void setValue(T value){
            this.value = value;
        }
        
        public node <T> getNext(){
            return next;
        }
        public void setNext(node<T> next){
            this.next =  next;
        }
    }
}

class LinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList_Generics<Integer> i = new SinglyLinkedList_Generics<>();
        i.add1(4);
        i.add1(3);
        i.add1(2);
        i.add1(1);

        i.print();

        System.out.println("\nRemove first and last elements :");
        i.remove1();
        i.remove2();
        
        i.print();

        System.out.println("\nAdd elements at last :");
        i.add2(5);
        i.add2(6);
        i.add2(7);
        
        i.print();

        SinglyLinkedList_Generics<String> s = new SinglyLinkedList_Generics<>();
        s.add1("171-15-8737");
        s.add1("\tDIU ID -");
        s.add1("Kabir");
        s.add1("Sharafat");
        s.add1("Redwan");
        
        System.out.println("\nAdd Sring elements :");
        
        s.print();
    }
}
