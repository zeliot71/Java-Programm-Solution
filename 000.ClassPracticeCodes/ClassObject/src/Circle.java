public class Circle {
    double radius;
    Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public boolean pointInsideCircle(Point point) {
        double distance = center.distance(point);
       return distance <= radius;
    }

    public boolean circleInsideCircle(Circle circle) {
        Point p1 = circle.center;
        Point p2 = this.center;
        double distance = p1.distance(p2);
        //        double distance = center.distance(circle.center);

        if(distance + circle.radius <= this.radius) {
            return true;
        }
        else
            return false;

    }

    public String toString() {
        return "Circle: radius " + radius + " center " + center;
    }
}
