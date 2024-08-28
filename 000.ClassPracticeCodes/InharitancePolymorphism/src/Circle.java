import java.awt.*;

public class Circle extends Shape2D {
    int radius;

    public Circle(int radius) {
        super(radius,radius);
        this.radius = radius;
    }

    @Override
    public double Area(){
        return Math.PI* Math.pow(radius,2);
    }

    @Override
    public double Perimeter(){
        return 2* Math.PI * radius;
    }
}
