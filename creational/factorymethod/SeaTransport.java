package factorymethod;

public class SeaTransport extends TransPort {
    @Override
    public Status CreateStatus() {
        return new ShipStatus();
    }
}
