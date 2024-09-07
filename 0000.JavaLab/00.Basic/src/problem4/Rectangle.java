package problem4;

import java.util.Scanner;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public int calculateArea() {
        return length * width;
    }
    public int calculatePerimeter() {
        return 2 * length * width;
    }
}

class TestRectangle{
    public static void main(String[] args) {
        System.out.println("Enter dimnesions of rectangle: ");
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println("Please enter a choice: \n 1) Area of Rectangle\n 2) Perimeter of rectangle\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            {
                Rectangle r1 = new Rectangle(v1, v2);
                System.out.println(r1.calculateArea());
                break;
            }
            case 2:
            {
                Rectangle r2 = new Rectangle(v1, v2);
                System.out.println(r2.calculatePerimeter());
                break;
            }
            default:
            {
                System.out.println("Invalid choice");
            }
        }
    }
}

