import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        // int[][] num = new int[3][4];
        // int[][] num2= {{1,2,3},{4,7,2},{5,7,9}};

        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Enter row: ");
        row = input.nextInt();
        System.out.println("Enter col: ");
        col = input.nextInt();

        int [][] num = new int[row][col];

        //input 2D array
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) {
                // System.out.println(num2[i][j]); //To print hardcoded array elements
                num[i][j] = input.nextInt();
            }
        }

//Print 2D array

        for (int i = 0; i < num.length; i++)
        {
            int rowSum=0, colSum=0;
            int maxInRow=num[0][0],maxIncol=num[0][0];
            for (int j = 0; j < num[i].length; j++) {

                //System.out.print(" "+num[i][j]);
                //sum+=num[i][j];
                rowSum+=num[i][j];
                colSum+=num[j][i];
                /*if(num[i][j]>maxInRow)
                {
                    maxInRow = num[i][j];
                }
                if(num[j][i]>maxIncol)
                {
                    maxIncol= num[j][i];
                }*/
            }
            System.out.println("Sum of row "+(i+1)+": "+rowSum);
            System.out.println();
            System.out.println("Sum of col "+(i+1)+": "+colSum);
            //System.out.println("Max in row"+(i+1)+": "+maxInRow);
            //System.out.println("Max in col"+(i+1)+": "+maxIncol);
        }
        //System.out.println("Sum row: "+sum);
    }
}
