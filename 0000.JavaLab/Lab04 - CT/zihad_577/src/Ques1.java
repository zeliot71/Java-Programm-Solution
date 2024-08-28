import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        print_array(n,arr);
        int[] Celement = get_central_element(n,arr);
        print_central_element(Celement);
    }

   static void print_array(int n,int[][] arr){
        int i,j;
       System.out.println("The array elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[] get_central_element(int n,int[][] arr){

        int t,b,m;
        t = n*n;
        b = n+n+(n-2)+(n-2);
        m = t-b;
        int[] cElemnts = new int[m];

        int index = 0;
        for(int i=1;i<n-1;i++)
        {
            for (int j=1;j<n-1;j++)
            {
                cElemnts[index++] = arr[i][j];
            }
        }
        return cElemnts;
    }

    static void print_central_element(int[] cElements){
        System.out.println("Central element of array elements: ");
        for(int i =0;i<cElements.length;i++)
        {
            System.out.print(" " + cElements[i]);
        }
        System.out.println();

    }


}
