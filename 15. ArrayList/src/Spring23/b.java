package Spring23;

import java.util.ArrayList;
import java.util.Collections;

public class b {
    public static void showList(ArrayList<Point>p){
        for(int i=0;i<p.size();i++){
            System.out.println(p.get(i).x+" "+p.get(i).y);
        }
    }

    public static void main(String[] args) {
        ArrayList<Point> a = new ArrayList<Point>();

        a.add(new Point(2, 3));
        a.add(new Point(4, 5));
        a.add(new Point(6, 7));
        a.add(new Point(8, 9));
        a.add(new Point(9, 10));
        a.add(new Point(11, 12));

        System.out.println("Before sorting: ");
       showList(a);
        Collections.sort(a);
        System.out.println("After sorting: ");

        showList(a);
    }
}

class Point implements Comparable<Point> {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x+this.y>o.x+o.y)
        {
            return -1;
        }
        else{
            return 1;
        }
    }
}
