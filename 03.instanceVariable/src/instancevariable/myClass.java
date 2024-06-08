
package instancevariable;
public class myClass {
    public int a=12;
    public int b=13;
    public int c;
    public void add(){
        this.c = this.a + this.b;
        System.out.println(this.c);
    }
}
