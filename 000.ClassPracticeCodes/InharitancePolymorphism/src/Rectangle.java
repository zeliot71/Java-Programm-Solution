import java.awt.*;

public class Rectangle extends Shape2D {

    public Rectangle(int length, int width) {
        super(length,width);
    }

    @Override
    public double Area(){
        return super.Area();
    }
    @Override
    public double Perimeter(){
        return super.Perimeter();
    }

    public double Diagonal(){
        return  Math.sqrt(Math.pow(length,2)+Math.pow(width,2));
    }
}
