package classNotes;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2000);
        list.add(300);
        list.add(4);
        list.add(-50);
        list.add(60);
        list.add(770);
        list.add(180);
        list.add(910);
        list.add(100);

        System.out.println("Before sorting: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);
        Collections.reverse(list);
        System.out.println("After reverse: "+list);


    }
}
