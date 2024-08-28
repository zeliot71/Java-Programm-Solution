package statickeyword;

 public class StaticClass {

     static int counter = 0;
     static void nothing(){
         counter++;
     }

     static {
         System.out.println("static block");

     }
}
