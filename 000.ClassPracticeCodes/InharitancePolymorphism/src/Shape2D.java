public class Shape2D {
    int length;
    int width;

    public Shape2D() {

    }
    public Shape2D(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public double Area(){
        return length * width;
    }

    public double Perimeter(){
        return 2 * length + width;
    }
}
