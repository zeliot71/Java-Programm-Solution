package lab1.task1;
class Even{
    int evenN;
    public void evenNumbers(int n){
        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

    }
}


public class Test {
    public static void main(String[] args) {
        Even even = new Even();
      //  System.out.println(even.evenNumbers(10));
        even.evenNumbers(10);
    }
}
