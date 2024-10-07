public class TA extends Student{

    final double salaryPerCourse = 10000;
    public int numberOfCourse;


    TA(int id,String name,double cgpa,int numberOfCourse){
        super(id,name,cgpa);
        this.numberOfCourse = numberOfCourse;
        if(this.cgpa >= 3.80){
            System.out.println("TA Assigned.");
        }
    }

    public void calculateSalary(){
        double salary = salaryPerCourse * numberOfCourse;
    }


}
