import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student st1 = new Student();
        Student st2 = new Student("Zihad","Dhaka",3.91f);



        /*st1.name = input.nextLine();
        st1.address = input.nextLine();
        st1.cgpa = input.nextFloat();
        st1.id = input.nextInt();*/
        //st1.display();

        System.out.println(st2);

    }
}
