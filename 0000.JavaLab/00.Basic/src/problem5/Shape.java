package problem5;

public class Shape {
    void printShape(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    void printRec(){
        System.out.println("This is Rectangle shape");
    }
}
class Circle extends Shape{
    void printCir(){
        System.out.println("This is Circular shape");
    }
}

class Square extends Rectangle{
    void printSqr(){
        System.out.println("Square is a rectangle");
    }
}

class Main{
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printRec();
    }
}