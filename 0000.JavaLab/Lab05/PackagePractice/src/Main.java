import pkg2.Class1;
import pkg1.*; //import all classes of package 1
public class Main {
    public static void main(String[] args) {

        //access another package's property using full path name
     pkg1.Class1 c1 = new pkg1.Class1();
//        pkg1.Class2 c2 = new pkg1.Class2();
//        pkg1.Class3 c3 = new pkg1.Class3();
        c1.x = 10;


        //Package2 er class1
        Class1 c4 = new Class1();
        c4.setName("Abul");

    }
}
