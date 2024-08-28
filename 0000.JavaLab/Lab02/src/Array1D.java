public class Array1D {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = {1,5,3,0,5,4,95,9};

        int max = array2[0];
        int min = array2[0];


        for(int i = 0; i < array2.length; i++)
        {
            if(min < array2[i])
                min = array2[i];
        }
        System.out.println("Max is: "+ min);

        for(int i = 0; i < array2.length; i++)
        {
            if(max > array2[i])
                max = array2[i];
        }
        System.out.println("Min is: "+ max);

        //Array2 sum
        Tasks tasks = new Tasks(array2.length,array2);
        tasks.arraySum();
    }
}

class Tasks{
    int[] array;
    int length;

    //constructor
    Tasks(int length, int[] array2) {
        array = array2;
        this.length = length;
    }
int sum = 0,arrAvg=0;
    void arraySum(){
        for(int i = 0; i < length; i++)
        {
            sum += array[i];
        }
        System.out.println("Sum is: "+ sum);

        arrAvg = sum/length;
        System.out.println("Avg is: "+ arrAvg);
    }

}