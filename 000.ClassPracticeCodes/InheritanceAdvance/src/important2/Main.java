package important2;

import org.w3c.dom.ls.LSOutput;

class Point2D{
    int x, y;
    Point2D(){

    }
    Point2D(int x, int y){
        this.x = x;
        this.y = y;

    }
}
class Point3D extends Point2D{
    int z;
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void print(){
        System.out.println(x + " " + y + " " + z);
    }

}

public class Main {
    public static void main(String[] args) {
        Point2D p[] = new Point2D[2];
       // p[0].x = 34; Not valid

        p[0] = new Point2D(5, 10);
        //p[1] = new Point2D(5, 20);
        System.out.println(p[0].x +" "+ p[0].y);
        Point2D pp[] = new Point3D[2];
         pp[0] = new Point3D(50, 100,500);

         if(pp[0] instanceof Point3D){
             Point3D pp1 = (Point3D)pp[0];
             pp1.print();
         }

    }
}
