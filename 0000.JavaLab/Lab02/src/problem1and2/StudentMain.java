package problem1and2;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student("Zeliot");

        Student[] st = new Student[3];

        st[0]= new Student("Zeliot",3,"zEliot@71.com");
        st[1]= new Student("Ruliet",8,"zRuliet@71.com");
        st[2]= new Student("Maliot",7,"zMalioteliot@71.com");

        for(int i = 0; i < st.length; i++){
            System.out.println(st[i]);
        }
    }
}

class Student{
    String name;
    int ID;
    String email;

    Student(){
        System.out.println("Unknown!");
    }
    Student(String name){
        this.name = name;
        System.out.println(name);
    }
    Student(String name, int ID, String email){
        this.name = name;
        this.ID = ID;
        this.email = email;
    }
    public String toString(){
        return name+" "+ID+" "+email;
    }
}