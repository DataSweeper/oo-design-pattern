package factorymethod;

public class Client {
    public static void main(String[] args) {
        TransPort transPort = new RoadTransport();
        transPort.getStatus();
        TransPort seaTransport = new SeaTransport();
        seaTransport.CreateStatus();
    }
}
