package Tutorial_Book_Study;
public class this_keyword {
    String name,nationality;
    int age;
    this_keyword (String name,int age) {
        this.name = name;
        this.age = age;
    }
    this_keyword (String name,int age,String nationality) {
        this(name,age);
        this.nationality = nationality;
    }
    void output(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nNationality : "+nationality);
    }
}
class test{
    public static void main(String args []){
        this_keyword obj = new this_keyword("Enrique",50,"Spanish.");
        obj.output();
        this_keyword obj1 = new this_keyword("Sharafat",21,"Bangladeshi.");
        obj1.output();
    }
}