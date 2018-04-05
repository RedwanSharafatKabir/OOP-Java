package Tutorial_Book_Study;
public class enum_datatype {
    // enum type must be global
    enum Day_detail {
        Off_day2, office_day1, office_day2, office_day3, office_day4, office_day5, Off_day1
    }
    public static void main(String args[]) {
        // method name.initialized value
        System.out.println("Value of SAT: " + Day_detail.Off_day2);
        System.out.println("Value of SUN: " + Day_detail.office_day1);
        System.out.println("Value of MON: " + Day_detail.office_day2);
        System.out.println("Value of TUE: " + Day_detail.office_day3);
        System.out.println("Value of WED: " + Day_detail.office_day4);
        System.out.println("Value of THU: " + Day_detail.office_day5);
        System.out.println("Value of FRI: " + Day_detail.Off_day1);
    }
}
