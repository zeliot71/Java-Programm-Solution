import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int [] late_arrival_times = new int [5];

        int avgLateness = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < late_arrival_times.length; i++)
        {
            late_arrival_times[i] = sc.nextInt();
            avgLateness += late_arrival_times[i]/5;
        }


        Employee emp = new Employee("Zeliot ",avgLateness);
        emp.evaluet_emp(emp.name, avgLateness);
        Employee emp2 = new Employee();
    }
}

class Employee{
    String name;
    double avg_lateness;

    public Employee(){
        System.out.println("Name: Unknown");
        System.out.println("Information: Unknown");
    }
    public Employee(String name, double avg_lateness){
        this.name = name;
        this.avg_lateness = avg_lateness;
    }

    void evaluet_emp(String name,double avg_lateness)
    {
        if(avg_lateness > 30)
        {
            System.out.println(name +"is good employee");
        }
        else
        {
            System.out.println(name + " is bad employee");
        }
    }
}
