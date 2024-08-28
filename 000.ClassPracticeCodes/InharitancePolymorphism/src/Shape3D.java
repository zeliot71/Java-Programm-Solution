public class Shape3D extends Shape2D {
    int height;

    public Shape3D(int height, int length, int width) {
        super(length, width);
        this.height = height;
    }


        public double Volume()
        {
            return  height* super.Area();
        }

        public double surfaceArea(){
        return 2*(length*width)+(width*height*height*length);
        }


}
