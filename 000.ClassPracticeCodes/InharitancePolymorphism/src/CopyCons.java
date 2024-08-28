import org.w3c.dom.ls.LSOutput;

public class CopyCons {
    public static void main(String[] args) {
        System.out.println("Copy Cons");
        Student st = new Student("Rahim",2,3.79);
        System.out.println(st);
        Student st2 = new Student();
        st.update(st2);
        System.out.println(st2);
        Student st3 = new Student(st2);
        st3.name = "Jamal";
        st3.id = 13;
        st3.cgpa = 3.82;
        System.out.println(st2);
        System.out.println(st3);
    }
}

class Student{
    String name;
    int id;
    double cgpa;

    public Student() {
    }

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public void update(Student st){
        st.name = "Karim";
        st.id = 10;
        st.cgpa = 3.92;
    }
    // copy constructor
    public Student(Student student){
        //this(student.name, student.id, student.cgpa);
        name = student.name;
        id = student.id;
        cgpa = student.cgpa;
    }
    @Override
    public String toString() {
        return "name = " + name + ", id = " + id + ", cgpa = " + cgpa;
    }
}