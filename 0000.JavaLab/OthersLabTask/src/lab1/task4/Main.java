package lab1.task4;



class PrimeNums{


    public void primes(int[] arr){

        for(int num: arr){
            if(isPrime(num)){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }

    private boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    }


public class Main {
    public static void main(String[] args) {

        int[] arr = {5,7,8,9,11,12};
        PrimeNums p = new PrimeNums();

        p.primes(arr);
    }

}
