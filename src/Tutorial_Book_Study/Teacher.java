package Tutorial_Book_Study;
public class Teacher {
    String name, gender,ID;
    public Teacher(String name,String gender,String ID){
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }
    public void display(){
        System.out.println("Name - "+name+", "+"Gender - "+gender+", "+"ID number - "+ID);
    }
}
