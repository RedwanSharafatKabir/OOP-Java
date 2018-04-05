package Tutorial_Book_Study;

public class DIU_section_D {
    double analysis(){
        double total = 40, present = 20;
        double absent = total - present;
        return absent;
    }
    public static void main(String[] args){
        DIU_section_D munna = new DIU_section_D();
        DIU_section_D ayon = new DIU_section_D();
        munna.analysis();                /* reference munna */
        ayon.analysis();                 /* reference ayon */
        System.out.println(munna.analysis());
        System.out.print(ayon.analysis());
        System.out.println();
    }
}