package problem6;

public class Account {
    int accNo;
    double balance;
    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void disp(){
        System.out.println("This is account sectoin");
    }

}
class Person extends Account {
    String name;
    int NID_no;
    Person(int accNo, double balance, String name, int NID_no) {
        super(accNo, balance);
        this.name = name;
        this.NID_no = NID_no;

    }
    void disp(){
        System.out.println("This is person account");
    }



    public String toString() {
       return accNo + " " + balance + " "+ name+ " "+ NID_no;
    }
}
class Test{
    public static void main(String[] args) {
        Person p[] = new Person[5];
    p[0] = new Person(03216516,1.15616,"Zeliot",516553);
        for(Person p1: p){
            System.out.println(p1);
        }
    }
}
