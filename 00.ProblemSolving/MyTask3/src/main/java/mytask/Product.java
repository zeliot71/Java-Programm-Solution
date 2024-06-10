
package mytask;
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter id: ");
        int id = input.nextInt();
        input.nextLine();
                
        String title,description,category;
        
        System.out.print("title: ");
        title= input.nextLine();
        
          System.out.print("Price: ");
        float  price = input.nextFloat();
        input.nextLine();
        System.out.print("category : ");
        category = input.nextLine();
                
        System.out.print("Description: ");
        description = input.nextLine();
        
        System.out.println(" Id: " + id +
                "\n Title: " + title +
                "\n Price:"+ price +
                "\n Description: "+ description +
                "\n Category: "+ category);
        
        
    }
}

