//Course class
class Course{
    String courseCode,courseName;
    float  credit;
    public Course(String courseCode, String courseName, float credit){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;

    }


}

//Department
class Department{

    String departmentName;
    Course course[];
    public Department(String departmentName,Course[] course){
        this.departmentName = departmentName;
        this.course = course;

    }

    public void displayCourses(){
        System.out.println("\nDepartment Name: " + this.departmentName);

        for(Course c : course){
            System.out.println(" Course Code: " + c.courseCode + " Course Name: " + c.courseName + " Credit: " + c.credit);
        }
    }

}


// CSE subclass
class CSE extends Department{

    public CSE(String departmentName, Course[] course) {
        super(departmentName, course);
    }

}

// EEE subclass
class EEE extends Department{

    public EEE(String departmentName, Course[] course) {
        super(departmentName, course);
    }
}

// CIVIL subclass
class CIVIL extends Department{

    public CIVIL(String departmentName, Course[] course) {
        super(departmentName, course);
    }
}

// DATA_SCIENCE subclass
class DATA_SCIENCE extends Department{

    public DATA_SCIENCE(String departmentName, Course[] course) {
        super(departmentName, course);
    }
}



// Main class
public class UIU {
    public static void main(String[] args) {
        Department[] departments = new Department[4];

        Course[] cseCourse = {
                new Course(" CSE 1115 ","OOP",3.0f),
                new Course(" CSE 1116 ","OOP Lab",1.0f),
        };
        departments[0] = new CSE("CSE",cseCourse);

        Course[] eeeCourse = {
                new Course("EEE 2113","Electrical Circuits",3.0f),
                new Course("EEE 2114","Electronics",3.0f),
        };
        departments[1] = new EEE("EEE",eeeCourse);

        Course[] civilCourse = {
                new Course("CE 2171","Fluid Mechanics",3.0f),
                new Course("CE 2172","Fluid Mechanics Lab",1.5f),
        };
        departments[2] = new CIVIL("CIVIL",civilCourse);

        Course[] dataScienceCourse = {
                new Course("DS 3521","Data Visualization",3.0f),
                new Course("DS 3522","Data Visualization Lab",1.0f),
        };
        departments[3] = new DATA_SCIENCE("DATA_SCIENCE",dataScienceCourse);

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
