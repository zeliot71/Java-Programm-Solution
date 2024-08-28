package encapsulation;

public class Person {
    private int age;
    int id;
    private double height,weight;

    public Person(int age, int id, double height, double weight) {
        this.age = age;
        this.id = id;
        this.height = height;
        this.weight = weight;

    }

    public boolean canVote(){
        return  this.age >= 18;
    }

    //getter setter
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    private double BMI(){
        return this.weight / (this.height * this.height);
    }

    public double BMI1(){
        return this.BMI();
    }
}

class  Test{
    public static void main(String[] args) {
        Person person = new Person(17,2222,5.5,50);
        //System.out.println(person.age);  /* Age has private access in encapsulation.Person.java */
        if(person.canVote()){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        int a = person.getAge()+1;
        System.out.println(person.getAge());

        if(person.canVote()){
            System.out.println("Yes");
        }
        else
            System.out.println("No");

        person.setAge(a);
        System.out.println(person.getAge());

        System.out.println("Person's BMI = "+ person.BMI1());
    }
}