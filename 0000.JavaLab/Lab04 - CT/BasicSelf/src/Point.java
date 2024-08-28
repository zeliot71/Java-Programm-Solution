public class Point {
   int x;
   int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

public double distance(Point p) {
        int x1 = p.x;
        int y1 = p.y;
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
    }

}
