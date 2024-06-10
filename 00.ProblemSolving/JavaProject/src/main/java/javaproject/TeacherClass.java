
package javaproject;

public class TeacherClass {
    
   String name,gender;
   int phone;
   public void setInfo(String n,String g,int p)
   {
        name = n;
        gender = g;
        phone = p;
   }
   
   public void display()
   {
       System.out.println("Name: "+name);
       System.out.println("Gender: "+gender);
       System.out.println("Phone: "+phone);
       System.out.println("\n");
   }
   
}
