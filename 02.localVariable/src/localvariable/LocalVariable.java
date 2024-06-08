package localvariable;

public class LocalVariable {

    public static void main(String[] args) {
        System.out.println("Example of local variable..");
        
        myClass clsObject = new myClass();
        
        clsObject.add();
        System.out.println(clsObject.ins);
    }
    
}
