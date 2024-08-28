class A{
    void show(){
        System.out.println("A");
    }
        }

class B extends A{

        }

class C extends B{
         void show(){
        System.out.println("c");
         }
    }
public class Main {
    public static void main(String[] args) {
        A a =new C();
        a.show();

        B b =new C();
        b.show();

        A a1 =new B();
        a1.show();
    }
}
