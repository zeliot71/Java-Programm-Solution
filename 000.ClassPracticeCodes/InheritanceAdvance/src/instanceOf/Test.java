package instanceOf;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        if(animal instanceof Animal){
            System.out.println("This is Animal");
        }
        if(animal instanceof Dog){
            System.out.println("This is Monster");
        }
        if(animal instanceof Cat){
            System.out.println("This is also Monster");
        }
        if(dog instanceof Dog){
            System.out.println("This is Dog");
        }
        if(cat instanceof Cat){
            System.out.println("This is Cat");
        }
        if(dog instanceof Animal){
            System.out.println("This is actual dog animal");
        }
        if(cat instanceof Animal){
            System.out.println("This is actual cat animal");
        }
    }
}
