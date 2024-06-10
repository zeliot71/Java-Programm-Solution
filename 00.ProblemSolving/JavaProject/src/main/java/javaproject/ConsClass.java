
package javaproject;


public class ConsClass {
    String name,gender;
    int phone;
    public ConsClass(String n,String g,int p)
    {
        name =n;
        gender = g;
        phone =p;
    }
    
    public void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n");
       
    }
     
}
