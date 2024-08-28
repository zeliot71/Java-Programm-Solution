
public class Test {
    public static void main(String[] args) {

        try{
            int x = 19;
            int y = 0;

            int result = x/y;
            System.out.println("Result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException e2){
            System.out.println("Exception: "+ e2.getMessage());
        }
        try{
            String str = "Abul";
            System.out.println(str.charAt(9));
        }
        catch(StringIndexOutOfBoundsException e3){
            System.out.println("Exception: "+ e3.getMessage());
        }
        try{
            int[] a = new int[4];

            a[4]=10;
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("Exception: "+ e4.getMessage());
        }
        finally {
            System.out.println("Last line of code");
        }

    }
}

