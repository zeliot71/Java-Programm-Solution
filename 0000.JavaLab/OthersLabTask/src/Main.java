class Animal{
    float age;
    String sound;
    String type;

    public Animal(float age,String sound, String type){
        this.age = age;
        this.type = type;
        this.sound = sound;

    }
    void makeSound(){
        System.out.println("Animal makes sounds "+ this.sound);
    }
}
class Pet extends Animal{
    String name;
    public Pet(float age, String name){
        super(age,name,"Pet");
        this.name = name;

    }

    void Rest(){
        System.out.println(name + " is resting!");
    }
}

class Wild extends Animal{


    public Wild(float age, String sound, String type) {
        super(age, sound, type);
    }

    void Hunt(){
        System.out.println(type +"is hunting!");
    }
}
class Cat extends Pet{

    public Cat(float age, String name) {
        super(age, name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the cat says: Meow!");
    }

}

class Tiger extends Wild{

    public Tiger(float age) {
        super(age, "Roar","Tiger" );
    }

    void makeSound(String sound){
        System.out.println(type + "the tiger says: HaluUmmm!");
    }
}

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Tiger(10,"Haluum","Hunter");
        Cat myCat = new Cat(10,"Whiskers");
        myCat.makeSound();

        Tiger myTiger = new Tiger(5);
        myTiger.makeSound();
    }
}
