package summer22.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    public String name;
    public int age;
    public double cgpa;

    public Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    public boolean equals(Student s){
        if(this.name.equals(s.name));
        {
            return true;
        }
    }


}



public class ArrayListDemo {
    public static void showList(ArrayList<Student> student)
    {
        for(Student s : student)
        {
            System.out.println(s.name+" "+s.age+" "+s.cgpa);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John Smith", 20, 3.9));
        students.add(new Student("Zhang Smith", 21, 2.9));
        students.add(new Student("Buffon Smith", 23, 3));

        Student query = new Student("Buffon Smith", 0, 0);



        System.out.println(students.add(query));

        System.out.println("Before sorting: ");
        showList(students);


/*class cgComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.cgpa, s2.cgpa);
    }
}*/
       // Collections.sort(students,new cgComparator());
        Collections.sort(students,new Comparator<Student>(){
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.cgpa, o2.cgpa);
            }
        });

        System.out.println("After sorting: ");
        showList(students);
    }
}
