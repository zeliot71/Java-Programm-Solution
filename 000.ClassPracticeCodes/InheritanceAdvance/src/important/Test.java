package important;

import org.w3c.dom.ls.LSOutput;

class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public static void main(String[] args) {

        Point p = new Point(5,6);
        Test.update1(p);
        System.out.println(p.x +" "+ p.y);
        Test.update2(p);
        System.out.println(p.x +" "+ p.y);
    }


}
public class Test {
    public static void update1(Point p1) {
        Point p = new Point(3,4);
        p.x = 19;
        p.y = 20;
    }
    public static void update2(Point p2){
        p2.x += 100;
        p2.y += 100;
    }

}

