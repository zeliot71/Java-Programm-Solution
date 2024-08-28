package problem1;

abstract class Shape {
     double x,y;

     Shape(double x, double y) {
         this.x = x;
         this.y = y;
     }

    abstract void Area();
}

class Rectangle extends Shape {
    Rectangle(double x, double y) {
        super(x, y);
    }
    void Area() {
        System.out.println("Area of Rectangle: " + x * y);
    }
}
class Circle extends Shape {
    double radius;

    Circle(double x, double y) {
        super(x, y);
    }
    Circle(double radius){
        super(radius,radius);
        this.radius = radius;

    }

    @Override
    void Area() {
        System.out.println("Area of Circle: " +3.1416* radius * radius);
    }
}

class Test{
    public static void main(String[] args) {
        Shape shape1,shape2;
        shape1 = new Circle(5);
        shape1.Area();
        shape2 = new Rectangle(20,10);
        shape2.Area();
    }
}