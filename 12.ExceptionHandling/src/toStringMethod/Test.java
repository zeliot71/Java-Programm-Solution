package toStringMethod;

class Horror{
    String name = "ShakChunni";
    int age = 18;
    String genre = "Bhoot";
    String color = "Black&White";
    double frequency = 131.03251561356;

    @Override
    public String toString() {
        return "Name: "+name + "\n Age: " + age + "\n Genre: " + genre + "\n Color: " + color + "\n Frq: " + frequency;
        }
}
public class Test {
    public static void main(String[] args) {

        Horror horror = new Horror();
        System.out.println(horror);
    }
}
