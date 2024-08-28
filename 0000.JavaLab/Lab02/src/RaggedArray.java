public class RaggedArray {
    public static void main(String[] args) {
        //declare and initalization of ragged or jig jag array
        //int[][] num= {{1,2,3},{4,7},{5,7,9},{3,4,6,2,3}};
        int[][] num= new int[4][];
        num[0]=new int[3];
        num[1]= new int[2];
        num[2]=new int[3];
        num[3]= new int[5];

        for (int i=0;i<num.length;i++)
        {
            for (int j=0;j<num[i].length;j++)
            {
                System.out.print(" *"+num[i][j]);
            }
            System.out.println();
        }
    }
}
