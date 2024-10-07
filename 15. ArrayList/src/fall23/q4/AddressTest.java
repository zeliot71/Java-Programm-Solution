package fall23.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Address {
    String building_number,area,city;
    int zip_code;

    Address(String building_number, String area, String city, int zip_code) {
        this.building_number = building_number;
        this.area = area;
        this.city = city;
        this.zip_code = zip_code;
    }

    int getZipCode() {
        return zip_code;
    }

}

public class AddressTest{
    public static void main(String[] args) {
        ArrayList<Address> al = new ArrayList<Address>();

        al.add(new Address("19/A","Dhanmondi","Dhaka",1209));
        al.add(new Address("2/A","Tejgaon","Dhaka",1215));
        al.add(new Address("65","Nirala","Khulna",9100));

        al.add(1,new Address("215","Aamtola","Barishal",8200));

        al.add(2,new Address("36","Gulshan","Dhaka",1212));

        for (Address addr : al) {
            System.out.println( addr.building_number+" "+addr.area + " " + addr.city + " " + addr.zip_code );
        }



        Collections.sort(al,new Comparator<Address>(){
            public int compare(Address o1, Address o2) {
                return Integer.compare(o1.getZipCode(), o2.getZipCode());
            }
        });

        al.remove(2);

        System.out.println("Index 2 removed");
        for (Address addr : al) {
            System.out.println(addr.building_number+" "+addr.area + " " + addr.city + " " + addr.zip_code );
        }

    }
}