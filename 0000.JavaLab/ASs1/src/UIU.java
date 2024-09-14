import javax.swing.plaf.IconUIResource;

// create Course class
class Course{
    String courseName, courseCode;
    float credit;
    public Course(String courseName, String courseCode, float credit){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;
    }


}

// create Department
class Department{
    String depaName;
    Course[] course = new Course[2];

    public Department(String depaName, Course[] course){
        this.depaName = depaName;
        this.course = course;
    }

    public void displayCourse(){

        for(int i = 0; i < course.length; i++){
            System.out.print("Course Name: "+course[i].courseName);
            System.out.print(" Course Code: "+course[i].courseCode);
            System.out.print(" Credits: "+course[i].credit);
        }
    }

}

// create CSE subclass
class CSE extends Department{
    public CSE(String depaName, Course[] course) {
        super(depaName, course);
    }
}
// create EEE subclass
class EEE extends Department{
    public EEE(String depaName, Course[] course) {
        super(depaName, course);
    }
}
// create CIVIL subclass
class CIVIL extends Department{
    CIVIL(String depaName, Course[] course) {
        super(depaName, course);
    }
}
// create DATA_SCIENCE subclass
class DS extends Department{
    DS(String depaName, Course[] course) {
        super(depaName, course);
    }
}

// Main class
public class UIU {
    public static void main(String[] args) {
        Department[] departments = new Department[4];
        departments[0] = new CSE();
        departments[1] = new EEE();
        departments[2] = new CIVIL();
        departments[3] = new DATA_SCIENCE();

        for (int i = 0; i < departments.length; i++) {
            departments[i].displayCourses();
            System.out.println();
        }
    }
}


// output:

/*

Department: CSE
Course Code: CSE 1115, Course Name: OOP, Credits: 3.0
Course Code: CSE 1116, Course Name: OOP Lab, Credits: 1.0

Department: EEE
Course Code: EEE 2113, Course Name: Electrical Circuits, Credits: 3.0
Course Code: EEE 2123, Course Name: Electronics, Credits: 3.0

Department: CIVIL
Course Code: CE 2171, Course Name: Fluid Mechanics, Credits: 3.0
Course Code: CE 2172, Course Name: Fluid Mechanics Lab, Credits: 1.5

Department: DATA_SCIENCE
Course Code: DS 3521, Course Name: Data Visualization, Credits: 3.0
Course Code: DS 3522, Course Name: Data Visualization Lab, Credits: 1.0

*/