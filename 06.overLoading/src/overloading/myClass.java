package overloading;

public class myClass {
    public void load(int a,int b)
    {
        int c = a+b;
        System.out.println(c);
    }
    
    public void load(int x,int y,int z)
    {
        int xyz = x+y+z;
        
        System.out.println(xyz);
    }
    
}
