public class Person {
    private String name;
    private int age;
    private String gender;
    public Person()
    {
        this("Zeliot", 22, "Male");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void setNGA(String name,String gender,int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
class Employee extends Person {
    public int employee_id;
    public String depertment;

    public Employee(String name, int age, String gender, int employee_id, String depertment) {
        super(name, age, gender);
        this.employee_id = employee_id;
        this.depertment = depertment;

    }

    @Override
    public void setNGA(String name,String gender,int age) {
        System.out.println("Employee ID: "+employee_id+" Name: "+name+" Gender: "+gender+" Age: "+age);

    }

}

class main{
    public static void main(String[] args) {
        Employee emp = new Employee("Zzeliot",22,"M",1,"Salse");
        System.out.println(emp.getName());
        System.out.println(emp.getGender());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
         emp.setNGA("Zuliet","M",15);
    }
}
