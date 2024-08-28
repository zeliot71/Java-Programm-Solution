class Plane implements ITransport,IFlyable{

    public void Land(){
        System.out.println("Normal methods in plane");
    }

    @Override
    public void StartEngine() {
        System.out.println("Starting plane engine..");
    }

    @Override
    public void StopEngine() {

    }

    @Override
    public void Move() {

    }

    @Override
    public void Fly() {

    }



}
