package writtingInFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrintWriter {
    public static void main(String[] args) {
        try{
            File file = new File("Person/Teacher.txt");
            PrintWriter writer = new PrintWriter(file);
        Student st1 = new Student("Zeliot", 101,3.51f);
        Student st2 = new Student("James", 102,3.51f);
        Student st3 = new Student("John", 103,3.51f);
        Student st4 = new Student("Mary", 104,3.51f);

        writer.println(st1.name +" "+ st1.id+" "+st1.cgpa);
        writer.println(st2.name +" "+ st2.id+" "+st2.cgpa);
        writer.println(st3.name +" "+ st3.id+" "+st3.cgpa);
        writer.println(st4.name +" "+ st4.id+" "+st4.cgpa);
        writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
