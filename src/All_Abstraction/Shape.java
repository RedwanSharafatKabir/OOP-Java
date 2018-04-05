package All_Abstraction;

abstract public class Shape {
    double x,y;
    Shape (double x,double y){
        this.x = x;
        this.y = y;
    }
    abstract void area ();
}
class rectangle extends Shape {
    rectangle (double x,double y){
        super(x,y);
    }
    @Override
    void area (){
        double result = x*y;
        System.out.println("Area of rectangle : " + result);
    }
}
class circle extends Shape {
    circle (double r){
        super(r,r);        
    }
    @Override
    void area (){
        double result = Math.PI*x*x;
        System.out.println("Area of circle : " + result);
    }
}
class triangle extends Shape {
    triangle (double x,double y){
        super(x,y);        
    }
    @Override
    void area (){
        double result = 0.5*x*y;
        System.out.println("Area of triangle : " + result);
    }
}
class result_shape {
    public static void main(String [] args){
        Shape obj ;  // reference variable
        
        obj = new rectangle(5.0,6.0);
        obj.area();
        obj = new circle(2.5);
        obj.area();
        obj = new triangle(3,6);
        obj.area();
    }
}
