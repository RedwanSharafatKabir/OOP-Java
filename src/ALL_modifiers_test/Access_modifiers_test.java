package ALL_modifiers_test;
import ALL_modifiers.Access_modifiers;
public class Access_modifiers_test extends Access_modifiers {
    
    public static void main(String args []){
        Access_modifiers obj = new Access_modifiers();
        
        obj.set_ID(171.8737);
        obj.set_age(21);
        
        obj.display_name();
        obj.get_ID();
        obj.get_age();
        obj.display_cgpa();
    }
}
