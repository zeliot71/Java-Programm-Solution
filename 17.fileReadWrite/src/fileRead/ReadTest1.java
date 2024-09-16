package fileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTest1 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("Person/Sudent.txt");
           // BufferedReader br = new BufferedReader(file);
            Scanner br = new Scanner(file);




            while(br.hasNext()){
                String line = br.nextLine();
                String[] parts = line.split(" ");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                System.out.println("ID  : " + id + "\nName: " + name);
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
