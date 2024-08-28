import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Afghanistan myLOve");
        countryNames.add("Albania");
        countryNames.add("Anguilla");
        countryNames.add("Argentina");
        countryNames.add("Australia");
        countryNames.add("Austria");
        countryNames.add(6,"Bangladesh");
        countryNames.add("Nepal");
        countryNames.addFirst("Ghana");


        countryNames.removeLast();
        System.out.println(countryNames);
        

        System.out.println(countryNames.size());

        System.out.println("First one: "+countryNames.getFirst());
        System.out.println("Last one: "+countryNames.getLast());

        countryNames.clear();

        for(String country: countryNames){
            System.out.println(country);
        }


    }
}
