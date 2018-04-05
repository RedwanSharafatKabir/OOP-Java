package Tutorial_Book_Study;

public class Bicycle {
    int cadence=0;
    int speed=0;
    int gear=1;
    void Cadence(int value){
        cadence=value;
    }
    void Gear(int value){
        gear=value;
    }
    void Speed_up(int increment){
        speed=speed+increment;
    }
    void Speed_down(int decrement){
        speed=speed-decrement;
    }
    void main_output(){
        System.out.println("Cadence : " + cadence + " " + "Speed : " + speed + " " + "Gear : " + gear);
    }
        public static void main(String[] args){
        Bicycle munna = new Bicycle();
        Bicycle palash = new Bicycle();

        munna.Cadence(50);
        munna.Speed_up(15);
        munna.Gear(2);
        munna.main_output();

        palash.Cadence(50);
        palash.Speed_up(17);
        palash.Gear(2);
        
        palash.Cadence(40);
        palash.Speed_up(20);
        palash.Gear(3);
        palash.main_output();
    }
}