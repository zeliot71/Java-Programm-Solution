package problem3;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        Circle2 c2 = new Circle2(12);
        Circle3 c3 = new Circle3(21);

        Circle c4 = new Circle();

        c.getArea();
        c2.getArea();
        c3.getArea();
    }
}

class Circle {
    double radius;
    Circle(){
        System.out.println(1);
    }
    Circle(double radius){
        this.radius = radius;
    }
    void getArea(){
        System.out.println(3.1416*radius*radius);
    }
}
class Circle2 {
    double radius;
    Circle2(){
        System.out.println(1);
    }
    Circle2(double radius){
        this.radius = radius;
    }
    void getArea(){
        System.out.println(3.1416*radius*radius);
    }
}
class Circle3 {
    double radius;
    Circle3(){
        System.out.println(1);
    }
    Circle3(double radius){
        this.radius = radius;
    }
    void getArea(){
        System.out.println(3.1416*radius*radius);
    }
}