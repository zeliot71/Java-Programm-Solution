public sealed class Bus implements ITransport permits MiniBus,Lenoga {


    @Override
    public void Fly() {
        System.out.println("Flying Bus.. ");
    }

    @Override
    public void StartEngine() {

    }

    @Override
    public void StopEngine() {

    }

    @Override
    public void Move() {

    }
}
