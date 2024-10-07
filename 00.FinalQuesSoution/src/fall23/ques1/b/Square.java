package fall23.ques1.b;

public class Square extends Rectangle{
    private double n;
    public Square(double n) {
        super(n,n);
        this.n = n;
    }
    @Override
    public double getArea() {

       return n*n;
    }
}
