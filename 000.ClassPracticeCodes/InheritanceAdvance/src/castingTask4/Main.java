package castingTask4;

class Vehicle{
    void drive(){
        System.out.println("Driving Vehicle");
    }
}

class Car extends Vehicle{
    void honk(){
        System.out.println("Honking Car");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicles[] = new Vehicle[2];
        Car car1 = new Car();
        vehicles[0] = car1;
        Car car2 = new Car();
        vehicles[1] = car2;

        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                car.drive();
                car.honk();
            }

        }

    }
}
