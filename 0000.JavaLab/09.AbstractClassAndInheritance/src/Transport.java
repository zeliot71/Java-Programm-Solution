abstract class Transport {
    String speed;
    String pricing;
    public abstract void startEngine();


    public void endEngine(){
        startEngine();
    }

}
