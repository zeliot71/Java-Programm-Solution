package fileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

public class FileDemo {
    public static void main(String[] args) {
       // File dir = new File("Person/Student.pdf");
      //  File dir = new File("Person/Student.pdf");
       // File dir = new File("Person/Student.txt");
      /*  dir.mkdirs();
      String loc=  dir.getAbsolutePath();
        System.out.println(loc);
        String dirName = dir.getName();
        System.out.println(dirName);*/

       /* if(file.delete()){
            System.out.println("Directory "+ dir.getName()+" has been deleted!");

        }*/

        File file1 = new File("Person/Sudent.txt");
        File file2 = new File("Person/Teacher.txt");

        try{

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are created..");

        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
