
package javaproject;
import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
        
        System.out.printf("Enter a number: ");
        int sl = input.nextInt();
               
        System.out.printf("Enter phone number: ");
        double dbl = input.nextDouble();
        input.nextLine();
        System.out.printf("Enter a name: ");
        String name = input.nextLine();
        
        System.out.println("Number: "+sl);
        System.out.println("Phone: "+dbl);
        System.out.println("Name: "+name);
    }
}
