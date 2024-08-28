public interface IFlyable {
    int kmh = 10000;

    public default int getKmh(){
        return kmh;
    }
}
