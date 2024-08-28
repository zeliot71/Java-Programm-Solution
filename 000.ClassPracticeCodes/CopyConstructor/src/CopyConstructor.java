class Person{
    String name;
    int age;
    String address;

    public Person(String name, int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public Person(Person p0){
        this.name = p0.name;
        this.age = p0.age;
        this.address = p0.address;
    }

    public void updatePerson(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String toString(){
        return "Name: " + name + " Age: " + age + " Address: " + address;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 20, "123 Main Street");
        System.out.println(person);
        Person person1 = new Person("Zeliot", 22, "132  SubStreet");
        System.out.println(person1);
        Person person2 = new Person(person);
        person2.updatePerson("Karim", 30, "111 Bash Bagaan");
        System.out.println(person2);
        System.out.println(person);
    }
}
