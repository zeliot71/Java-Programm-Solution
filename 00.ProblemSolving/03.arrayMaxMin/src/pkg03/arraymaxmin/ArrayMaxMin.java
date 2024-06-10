
package pkg03.arraymaxmin;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] myArray = {2, 3, 9, 8, 13, 1, 5, 19, 15, 0, 4};
        
        int max = myArray[0];
        int min = myArray[0];
        
        
        for(int i=0;i<myArray.length;i++)
        {
            if(myArray[i]<min)
            {
                min = myArray[i];
            }
            if(myArray[i]>max)
            {
                max= myArray[i];
            }
        }
        System.out.println("Min is: " + min);
        System.out.println( "Max is "+ max);
    }
    
}
