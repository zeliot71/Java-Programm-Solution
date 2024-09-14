package lab1.task2;

import org.w3c.dom.ls.LSOutput;

class MinInArray{
    int min = Integer.MAX_VALUE;

    int min(int[] arr){
      //  System.out.println(min);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
class MaxInArray{
    int max = Integer.MIN_VALUE;
    int max(int[] arr){
       // System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,9,8,13,1,5,19,15,0,4};
        MinInArray min = new MinInArray();

        System.out.println(min.min(arr));
        MaxInArray max = new MaxInArray();
        System.out.println(max.max(arr));
    }
}
