package problem1;

public class Student {
    String name;

    Student(String name){
        this.name = name;
    }
    Student(){
        this.name = "Uknown";
    }
}

class Test{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
    }

}
