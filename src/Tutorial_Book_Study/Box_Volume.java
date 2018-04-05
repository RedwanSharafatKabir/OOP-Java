package Tutorial_Book_Study;

public class Box_Volume {
    double height, depth, width;
    Box_Volume(double height,double depth,double width){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void display(){
        System.out.println("Volune : " + height*width*depth);
    }
}
