package account;
import java.util.Scanner;

class Account {
    String acc_no;
    double bal;

    void display(){
        System.out.println("Accoun no: "+acc_no +"\nBalance: "+ bal);
    }
}
class  Person extends  Account{
    String name;
    int nid;
    Person(String acc_no,double bal,String name, int nid){
        this.name = name;
        this.nid = nid;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Name: "+name);
        System.out.println("NID number: "+ nid);
    }
}

public  class Test{
    public static void main(String[] args) {
        Person p[] = new Person[5];

        Scanner input = new Scanner(System.in);

        for(int i =0;i<2;i++){
            System.out.println("Person: "+(i+1));
            System.out.println("Enter account no: ");
            String acc_no = input.next();

            System.out.println("Enter balance: ");
            double bal = input.nextDouble();

            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("Enter Nid: ");
            int nid = input.nextInt();
            p[i]= new Person(acc_no,bal,name,nid);
        }

        for (int i=0;i<2;i++)
        {
            System.out.println("Person: "+(i+1));
            p[i].display();
        }
    }
}