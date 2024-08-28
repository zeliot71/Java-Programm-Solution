package castingTask3;
class Shape{

    void draw(){
        System.out.println("Drawing Shape");
    }

}

class Circle extends Shape{
    int radius;
    Circle(int r){
        radius = r;
    }
    int getRadius(){
        return radius;
    }
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle();

        Shape shapes[] = new Shape[2];
        shapes[0]=rectangle;
        shapes[1]=circle;

        shapes[0].draw();
        shapes[1].draw();

        for(Shape shape: shapes){
            if(shape instanceof Circle){
                shape.draw();
                ((Circle) shape).getRadius();
            }
            else if(shape instanceof Rectangle){
                shape.draw();
            }
            else{
                shape.draw();
            }
        }



    }
}
