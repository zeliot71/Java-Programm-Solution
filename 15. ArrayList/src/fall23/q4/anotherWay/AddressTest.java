package fall23.q4.anotherWay;

import java.util.ArrayList;
import java.util.Collections;

class Address  implements Comparable<Address>{
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

    public int compareTo(Address o) {
        return Integer.compare(zip_code, o.zip_code);
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

        System.out.println("Before sorting:");
        for (Address addr : al) {
            System.out.println( addr.building_number+" "+addr.area + " " + addr.city + " " + addr.zip_code );
        }

        Collections.sort(al);

        System.out.println("After sorting: ");
        for (Address addr : al) {
            System.out.println( addr.building_number+" "+addr.area + " " + addr.city + " " + addr.zip_code );
        }

    }

}

