package Problem2;

import Problem2.patients.Patient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of patients : ");
       int n = sc.nextInt();
       sc.nextLine();
       int id;   String name;
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter patient id : ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter patient name : ");
            name = sc.nextLine();
            System.out.println("Enter history : ");

            String history = sc.nextLine();

            System.out.println("Enter medicines : ");
            String medicines = sc.nextLine();

           // patients[i] = new Patient(id,name);
            patients[i] = new Patient(id,name,history);

            patients[i].setMedicines(medicines);
        }
        System.out.println("Medicines for all patients: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Patient ID: "+patients[i].getPid()+", Medicines: "+patients[i].getMedicines());
        }
    }
}
