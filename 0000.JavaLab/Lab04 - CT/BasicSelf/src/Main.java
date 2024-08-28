
public class Main {
    public static void main(String[] args) {

        Point p = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);

        double dis = p.distance(p2);
        System.out.println(dis);

        Circle c1 = new Circle(p,4);
        boolean b = c1.pointInsideCircle(p2);
        if(b)
        {
            System.out.println("Inside Circle");
        }
        else{
            System.out.println("Not Inside Circle");
        }

        Circle c2=new Circle(p3,5);
        boolean b2=c2.circleInsideCircle(c1);
        System.out.println(b2);
    }
}
