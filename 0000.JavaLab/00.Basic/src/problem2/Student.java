package problem2;


public class Student {
    String name;
    float grade;
    String email;

    Student(String name, float grade, String email){
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    public String toString(){
        return name + " " + grade + " " + email;
    }
}

class Test{
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Zeliot", 1.99F,"@pookie.com");
        students[1] = new Student("Mmind", 3.50F,"@haununcle.com");
        students[2] = new Student("Remi", 2.69F,"@skibidi.com");

        for(Student student : students){
            System.out.println(student);
        }
    }
}
