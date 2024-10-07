import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        try{
            InputStream f1=new FileInputStream("File/a.txt");
           /* System.out.println((char)f1.read());
            System.out.println(f1.available());*/
            int a=0;
            while(true){
                a=f1.read();
               if(a== -1){
                   break;
               }
               else if(a > 48 && a < 97) {
                   System.out.print( (char)a);
               }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
