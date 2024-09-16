package writtingInFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWritter {
    public static void main(String[] args) {

        try{
            FileWriter file = new FileWriter("Person/Teacher.txt", true);
            BufferedWriter bWr = new BufferedWriter(file);
            bWr.write("Zeliot Zenderson");
            bWr.newLine();
            bWr.write("11111");

            bWr.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
