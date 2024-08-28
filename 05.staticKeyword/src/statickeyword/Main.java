package statickeyword;
public class Main {

    public static void main(String[] args) {

       //System.out.println(newClass.a);
       newClass.display();
       newClass n1 = new newClass();
       OldClass o1 = new OldClass();
       OldClass o2 = new OldClass();
      // OldClass o3 = (OldClass)n1;
        //System.out.println(o3.uniName);
       //newClass n4 = (newClass)o1;

        //System.out.println(n4.uniName);


        System.out.println(OldClass.uniName);
        System.out.println(o1.uniName);
        System.out.println(o2.uniName);

block blck = new block();

    }

    static {
        System.out.println("Static block");
    }
}
class block{
    static {
        System.out.println("Static block");
    }
}
