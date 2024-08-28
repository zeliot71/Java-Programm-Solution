public class Main {
    public static void main(String[] args) {

        Transport t = new Bus();
        Transport t2 = new Train();

        t.startEngine();
        t2.startEngine();
        t.endEngine();
    }
}
