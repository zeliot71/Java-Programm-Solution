public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);

        System.out.println("Rectangle Area: " + rectangle.Area());
        System.out.println("Rectangle Perimeter: " + rectangle.Perimeter());
        System.out.println("Rectangle Diagonal: " + rectangle.Diagonal());

        Circle circle = new Circle(10);
        System.out.println("Circle Area: "+ circle.Area());
        System.out.println("Circle Perimeter: "+ circle.Perimeter());

        Triangle triangle = new Triangle(10,20);
        System.out.println("Triangle Area: "+ triangle.Area());
        System.out.println("Triangle Perimeter: "+ triangle.Perimeter());


    }
}
