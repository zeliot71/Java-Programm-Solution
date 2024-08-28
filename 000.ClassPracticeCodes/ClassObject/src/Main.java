public class Main {
    public static void main(String[] args) {
        Point center1 = new Point(5, 8);
        Point center2 = new Point(3, 2);
        Circle c1 = new Circle(4,center2);

        if(c1.pointInsideCircle(center1)){
            System.out.println("Point Inside Circle");
        }
        else
            System.out.println("Point Outside Circle");

        //System.out.println(c);
        Circle c2 = new Circle(5,center2);

        if(c1.circleInsideCircle(c2)){
            System.out.println("Circle Inside Circle");
        }
        else
            System.out.println("Circle Outside Circle");


    }
}
