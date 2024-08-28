package example;

public abstract class MobileUser {

    abstract void SendMessage();
}
class Rahim extends MobileUser {

    void SendMessage() {
        System.out.println("Rahim's message");
    }
}

class Karim extends MobileUser {
    void SendMessage() {
        System.out.println("Karim's message");
    }
}

class Test{
    public static void main(String[] args) {
        MobileUser mu;
        mu = new Rahim();
        mu.SendMessage();
        mu = new Karim();
        mu.SendMessage();
    }
}