// package Lab_Practice;
public class Item {
    String itemname;
    double price;
    Item(String itemname,double price){
        this.itemname = itemname;
        this.price = price;
    }
    public void display2 (){
        System.out.println ("Item Name : " + itemname + "\n" + "Item Price : " + price + "$");
    }
}
