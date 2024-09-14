package classNotes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Point implements Comparable<Point> {

    int x, y;
    Point(){

    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showList(ArrayList<Point> p){
        for(int i=0;i<p.size();i++){
            System.out.println(p.get(i).x + " "+ p.get(i).y);
        }
    }

    @Override
    public int compareTo(Point p) {
        int flag =0;
        if(this.y == p.y){
            flag =0;
        }
        else if(this.y > p.y){
            flag= 1;
        }
        else if(this.y < p.y){
            flag = -1;
        }
        return flag;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> p = new ArrayList<Point>();
        Point point1 = new Point();
        p.add(new Point(7,8));
        p.add(new Point(7,9));
        p.add(new Point(7,10));
        p.add(new Point(1, 2));
        p.add(new Point(5, 6));
        //System.out.println(p.get(1).x + " " + p.get(1).y);
        //System.out.println(p.get(0).x + " " + p.get(0).y);

        System.out.println("Before sort w.r.t Y: ");
        point1.showList(p);
        System.out.println("After sort w.r.t Y: ");
        Collections.sort(p);
        point1.showList(p);
    }
}
