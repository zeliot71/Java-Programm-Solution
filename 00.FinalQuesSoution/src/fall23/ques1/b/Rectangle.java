package fall23.ques1.b;

public class Rectangle implements iShape{

    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override public double getArea()
    {
        return length * width;
    }
}
