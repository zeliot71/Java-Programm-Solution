public class Person {
    int age;
    String name;
    private double height,weight;

    Person(int age) {
            this.age = age;
    }

    public  int setAge(int n)
    {
        return  this.age+n;
    }
}

class  Test{
 public static void main(String[]args)
 {
     Person p1 = new Person(17);
     System.out.println(p1.setAge(3));


 }
}
