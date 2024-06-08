
package instancevariable;

public class InstanceVariable {

    public static void main(String[] args) {
        System.out.println("Adding with instance variable..");
        
        myClass objectHolder = new myClass();
        
        objectHolder.add();
        
        System.out.println(objectHolder.a);
        System.out.println(objectHolder.b);
    }
    
}
