
package Constructor_overloading;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Zeliot","Male","Hello World,Java");
        Teacher teacher2 = new Teacher("Zeliot","Male",27739268);
        Teacher teacher3 = new Teacher();
        
        Teacher teacher4 = new Teacher("Zuliet","Female","Bottom of Heart");
        teacher4.displayInfo();
        teacher1.displayInfo();
        teacher2.displayInfo();
    }
}
