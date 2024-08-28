package inharitance;
class A{
    A(){
        System.out.println("Class A Constructor!");
    }
}
class B extends A{
    B(){

        System.out.println("Class B Constructor!");
    }
}
class  C extends B{
    C(){
        System.out.println("Class C Constructor!");
    }
}



public class InheritHybrid {
    public static void main(String[] args) {
        C objC = new C();
    }
}
