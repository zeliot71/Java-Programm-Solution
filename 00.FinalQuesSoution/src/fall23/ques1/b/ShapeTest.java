package fall23.ques1.b;

public class ShapeTest {

    public static void draw(iShape o){
        System.out.println("Drawing over " +o.getArea()+" area.");
    }

    public static void main(String[] args) {

        iShape r = new Rectangle(5,6);
        iShape s = new Square(3);
        draw(r);
        draw(s);
    }
}
