package problem3;

public class Circle {
    double radius;
    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.1416 * radius * radius;
    }
}

class Test{
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        Circle c2 = new Circle(12);
        Circle c3 = new Circle(21);

        System.out.println(c3.getArea());
    }
}
