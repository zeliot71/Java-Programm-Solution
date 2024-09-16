import java.util.Scanner;

public class Student {
  int id;
  String name;
  String cgpa;

  public Student(int id, String name, String cgpa) {
      this.id = id;
      this.name = name;
      this.cgpa = cgpa;
  }

  public void display() {
      System.out.println("ID: "+id + " Name: " + name + " CGPA: " + cgpa);
  }
  public void calculateCTmarks(String[] arr){
      double total = 0;
        for(int i = 0; i<arr.length; i++){
            double n = Double.parseDouble(arr[i]);
            total += n;
        }
      System.out.println("Avg CT marks: "+total/3);
  }

}
class Test{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id name and cgpa: ");
        String info = sc.nextLine();
        String[] parts = info.split(",");
        Student s = new Student(Integer.parseInt(parts[0]),parts[1],parts[2]);
        s.display();
        System.out.println("Enter CT(1-3) Marks: ");
        String marks = sc.nextLine();
        String[] parts2 = marks.split(",");
        s.calculateCTmarks(parts2);

    }
}

