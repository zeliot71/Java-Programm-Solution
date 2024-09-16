package fileRead;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {

        try{
            File file = new File("Person/Sudent.txt");
           Scanner sc = new Scanner(file);

           while(sc.hasNextLine()) {
           String id = sc.next();
           String name = sc.next();
               System.out.println("ID: " + id + " Name: " + name);
           }
            sc.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
