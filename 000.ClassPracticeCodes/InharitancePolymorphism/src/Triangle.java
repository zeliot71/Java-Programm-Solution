import java.awt.*;

public class Triangle extends Shape2D {
    int base,height;

    public Triangle(int base, int height) {
        super(base, height);
        this.base = base;
        this.height = height;
    }

    @Override
    public double Area()
    {
        return super.Area()*.5;
    }

    public  double Perimeter(){
        return super.Perimeter()-(base+height)+ Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
    }



}
