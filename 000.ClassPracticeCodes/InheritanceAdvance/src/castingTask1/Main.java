package castingTask1;
class Person{

    void walk(){
        System.out.println("Person is walking!");
    }
}
class Student extends Person{
    void study(){
        System.out.println("Student is studying!");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Student();
        Student s = (Student)p;
        s.study();
    }
}
