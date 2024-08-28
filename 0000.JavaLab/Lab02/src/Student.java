public class Student {
    String name,address;
    int id;
    float cgpa;

    Student()
    {
        System.out.println("Non parameterized constructor!");
    }
    Student(String name,String address,float cgpa)
    {
        this.name = name;
        this.address = address;
        this.cgpa = cgpa;
    }
   /* void display()
    {
        //System.out.println("Name: "+name);
        //System.out.println("Address: "+address);
        //System.out.println("ID: "+id);
        //System.out.println("CGpa: "+cgpa);
    }*/
    public String toString(){
        return name+" "+address+" "+cgpa;
    }



}
