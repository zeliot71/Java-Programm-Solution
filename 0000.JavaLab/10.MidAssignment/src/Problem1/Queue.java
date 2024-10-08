package Problem1;

public class Queue {
    public double[] queueElements;
    private int queueCapacity;
    private int lastIndex =-1;

    public Queue(int capacity) {
        queueCapacity = capacity;
        this.queueElements = new double[capacity];
        System.out.println("Creating a Problem1.Queue : Capacity " + queueCapacity);
    }

    public void setLastIndex( int lastIndex){

        this.lastIndex = lastIndex;
    }
    public int getLastIndex(){
        return this.lastIndex;
    }


    void enqueue(double n) {
        if(getLastIndex() == queueCapacity-1){
            System.out.println("Error Enqueuing " + n);
            return;
        }
            setLastIndex(getLastIndex() + 1);
            queueElements[getLastIndex()] = n;

            System.out.println("Enqueue " + n + ": Successful");

    }

    void dequeue() {
        if(getLastIndex() == -1){
            System.out.println("Problem1.Queue is Empty");
        }else{
            System.out.println("Dequeuing: Successful");

            for(int i = 0; i < lastIndex; i++){
                queueElements[i] = queueElements[i+1];
            }
            queueElements[lastIndex] = 0;
            lastIndex --;
            queueCapacity--;
       }
    }

    void printElements(){
        System.out.println("Showing Elements of the queue : ");
        /*for(double i : queueElements){
            System.out.print(i+" ");
        }*/
        for(int i = 0; i < queueCapacity; i++){
            System.out.print(queueElements[i] + " ");
        }
        System.out.println();
    }

}

class QueueTest{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5.2);

        q.enqueue(2.1);
        q.enqueue(-2.0);
        q.enqueue(7.88);
        q.enqueue(5.5);
        q.enqueue(1.1);

       q.printElements();
       q.dequeue();
        q.printElements();
        q.dequeue();
        q.dequeue();
        q.printElements();
        q.enqueue(10.666);
        q.printElements();
    }
}

