package Constructor_overloading;

public class Teacher {
    String name,gender,address;
    int phone;
    
    Teacher()
    {
        System.out.println("Nothing here..");
    }
    
    Teacher(String n,String g,String a)
    {
        name =n;
        gender = g;
        address = a;
        
    }
    
    Teacher(String n,String g,int p)
    {
        name =n;
        gender = g;
        phone =p;
        
    }
    
    void displayInfo()
    {
        System.out.println(" Name: "+name+"\n Gender: "+gender+"\n Phone: "+phone+"\n Address: "+address);
        System.out.println("\n");
    }
}
