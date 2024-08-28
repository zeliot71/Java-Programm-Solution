import java.util.Scanner;

public class Problem1Test {
    public static void main(String[] args) {
        int count = 1;
        do{
            try{
                int x,y;

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number1: ");
                x = sc.nextInt();
                System.out.println("Enter number2: ");
                y = sc.nextInt();
                int result = x/y;
                System.out.println("Result: "+x+"/"+y+" = "+result);
                count --;
            }
            catch(Exception e){
                System.out.println("Exeption: "+e);
                System.out.println("You must enter an integer number, Please try again! \n");
            }

        }
        while(count == 1);

    }
}
