package lab1.task3;

class CumulativeSum{


   public void cumSum(int[] arr){
       int[] sumCum= new int[8];
        for(int i=0;i<arr.length;i++){
            sumCum[i]= arr[i]+arr[i+1];
            System.out.println(sumCum[i]);
        }
    }


}

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        CumulativeSum sum = new CumulativeSum();

        sum.cumSum(arr);
    }

}
