public class TaskBox {
    float length,width,height;

    TaskBox(float length,float width,float height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    TaskBox()
    {
        this.length =1;
        this.width = 1;
        this.height=1;
    }

    void getVolume(){
        System.out.printf("Volume: %f \n", (height*width*length));
    }

}
