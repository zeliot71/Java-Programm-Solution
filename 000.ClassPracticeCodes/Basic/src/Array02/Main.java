package Array02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p[]= new Point[5];

        p[0]= new Point(5,20);
        Scanner sc = new Scanner(System.in);
        System.out.println(p[0].x);

        for (int i=0;i<5;i++)
        {
            System.out.println("input for index "+i+": ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            p[i]= new Point(a,b);
            p[i].s = b;
        }

        System.out.println("Point.s "+Point.s);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(p[i].x+ " "+ p[i].y);
        }
        System.out.println("Point.s " +Point.s);
        System.out.println("P1.s "+p1.s);
    }
}
