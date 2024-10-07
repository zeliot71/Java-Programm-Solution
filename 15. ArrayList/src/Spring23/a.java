package Spring23;

import java.util.ArrayList;

public class a {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();

        String str = "hello";


        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        if(list.size()>=3){
            list.set(2,'z');
        }

        System.out.println(list);
    }
}
