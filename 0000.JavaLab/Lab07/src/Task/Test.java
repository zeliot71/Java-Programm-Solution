package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,id and CGPA: ");
        String input = sc.nextLine();

        String[] parts= input.split(", ");

        Student st = new Student(parts[0],Integer.parseInt(parts[1]),Float.parseFloat(parts[2]));
        st.Display();

        System.out.println("Enter CT marks: ");
        String marks = sc.nextLine();

        String[] parts2 = marks.split(", ");

        System.out.println("Average CT mark is: "+st.calculateCTmarks(parts2)/parts2.length);

    }
}
class Student{
    String name;
    int id;
    float cg;

    Student(String name, int id, float cg){
        this.name = name;
        this.id = id;
        this.cg = cg;
    }

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("CGPA: "+cg);
    }
    int sum =0;
    int calculateCTmarks(String[] Ctm){
        for(int i=0;i<Ctm.length;i++){
            sum += Integer.parseInt(Ctm[i]);
        }
        return sum;
    }


}