package Basic01;

public class Main {
    public static void main(String[] args) {
       final Point p1 = new Point(30,300);
        Point p2 = new Point(20,200);

        /*System.out.println(p1.x);
        System.out.println(p2.x);
        p1 = new Point(5,10);*/

        new Point(7,7); //garbage
        //p2 = p1;

        System.out.println(p1.x);
        System.out.println(p2.x);
        System.out.println(p1.y);
        System.out.println(p2.y);
    }
}
