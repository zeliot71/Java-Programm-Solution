package inharitance;

class Parent {
    String name;
    int var1;

    Parent(){
        System.out.println("Parent Constructor");
    }
    void display()
    {
        System.out.println("Parent class "+ name);
    }
}

class child extends  Parent{

    child(int var3,String name)
    {
        super(); //
        this.name = name; //Child class name
        super.name = "Parent"; //Parent class name
        System.out.println("Child class constructor");
    }

    public child() {
        super();
    }

    /*String name;*/
    void display(){
        super.display();
        System.out.println("Child class "+ name);
    }
}

/*
class child_one extends  Parent{


    child_one(int var1) {
        super(var1);
    }

    void display(){
        super.display();
        System.out.println("Child class "+ name);
    }
}
*/

public class Test{
    public static void main(String[] args) {
        child objChild = new child();
        //Parent objParent = new Parent();
        objChild.name = "Child";
        objChild.var1 = 15;

        objChild.display();
    }
}

