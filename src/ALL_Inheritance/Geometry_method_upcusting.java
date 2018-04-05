package ALL_Inheritance;

public class Geometry_method_upcusting {
    double shape(){
        return 999;
    }
}
class rectangle extends Geometry_method_upcusting {
    double height,width;
    rectangle(double height,double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    double shape(){
        return height*width;
    }
}
class triangle extends Geometry_method_upcusting {
    double base,height;
    triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double shape(){
        return 0.5*base*height;
    }
}
class test_them {
    public static void main(String args[]){
        int i;
        Geometry_method_upcusting [] a = new Geometry_method_upcusting [10];
        a[0] = new Geometry_method_upcusting();
        
        // sub class variable refers super class objects = "downcusting"
        
        a[1] = new rectangle(2.5,2);   // super class variable refers sub class objects = "upcusting"
        a[2] = new triangle(4,6);   // super class variable refers sub class objects = "upcusting"
        for(i=0;i<3;i++){
            System.out.println(a[i].shape());
        }
    }
}
