
package javaproject;

public class ForEachDemo {
    
    public static void main(String[] args) {
        String[] names = new String[4];
        
        names[0] = "Shanto";
        names[1] = "Kobir";
        names[2] = "Kazi";
        names[3] = "Thakur";
        
        for(String x: names)
        {
            System.out.println(x);
        }
        
        
    }
}
