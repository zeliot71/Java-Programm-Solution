package CastingTask2;
class Animal{

    void makeSound(){
        System.out.println("Some Sound");

    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bark");
    }

}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.makeSound();
        }
    }
}
