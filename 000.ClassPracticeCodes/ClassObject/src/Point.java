public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double distance(Point p) {
        int a = this.x;
        int b = this.y;
        int c = p.x;
        int d = p.y;

       return Math.sqrt(Math.pow(a-c, 2) + Math.pow(b-d, 2));
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
