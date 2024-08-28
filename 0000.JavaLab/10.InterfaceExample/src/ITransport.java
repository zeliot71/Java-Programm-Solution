public interface ITransport {


    public void StartEngine();
    public void StopEngine();
    public void Move();
    public void Fly();

    public default void Land(){
        System.out.println("Default methods in interface");
    }


}
