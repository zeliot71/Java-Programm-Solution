import com.sun.jdi.connect.Transport;

public class Main {
    public static void main(String[] args) {
    ITransport transport = new Bus();

    transport.Fly();
   // transport.Land();

    Plane plane = new Plane();
    plane.Fly();
    plane.Land();

    int kmh = plane.getKmh();
        System.out.println(kmh);

        ITransport t =  (ITransport)plane;
        t.StartEngine();


    }
}
