interface Vehicle {

    public void StartEngine();

    public void StopEngine();

    public void Move();

    public void Fly();
    public void Crash();
}
interface Parts{
    public void Crash();
}

class Bus implements Vehicle {
    public void StartEngine() {
        System.out.println("Bus Engine Started");
    }
    public void StopEngine() {
        System.out.println("Bus Engine Stopped");
    }
    public void Move() {
        System.out.println("Bus Engine Moved");
    }
    public void Fly() {
        System.out.println("Bus Engine Flyed");
    }

    @java.lang.Override
    public void Crash() {
        System.out.println("Bus Engine Crashed");
    }
}

class Car implements Vehicle {
    public void StartEngine() {
        System.out.println("Car Engine Started");
    }
    public void StopEngine() {
        System.out.println("Car Engine Stopped");
    }
    public void Move() {
        System.out.println("Car Engine Moved");
    }
    public void Fly() {
        System.out.println("Car Engine Flyed");
    }

    @java.lang.Override
    public void Crash() {
        System.out.println("Car Engine Crashed");
    }
}


class OneTimeVehicle implements Vehicle ,Parts{
    public void StartEngine() {
        System.out.println("OneTimeVehicle Engine Started");
    }
    public void StopEngine() {
        System.out.println("OneTimeVehicle Destroyed!");
    }

    @Override
    public void Move() {
        System.out.println("OneTimeVehicle Moved");
    }

    @Override
    public void Fly() {
        System.out.println("OneTimeVehicle Flyed");
    }

    @Override
    public void Crash() {
        System.out.println("OneTimeVehicle Crashed");
    }
}

public class Test{
    public static void main(String[] args) {
        OneTimeVehicle onv = new OneTimeVehicle();
        onv.StartEngine();
        onv.Crash();
        onv.StopEngine();
        onv.Move();
    }
}