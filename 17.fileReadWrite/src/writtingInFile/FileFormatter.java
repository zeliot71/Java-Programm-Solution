package writtingInFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileFormatter {
    public static void main(String[] args) {

        /*File dir = new File("Person/Student.txt");
        dir.delete();*/
        // Folder/Directory Person/Student.txt deleted!

        String id, Name;
        try {
            Formatter formatter = new Formatter("Person/Sudent.txt");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many students: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter student name and id: ");
                id = sc.next();
                Name = sc.next();
                formatter.format("%s %s\r\n",id,Name);

            }
            formatter.close();
        }
        catch (FileNotFoundException e0) {
            System.out.println(e0.getMessage());
        }
    }
}
