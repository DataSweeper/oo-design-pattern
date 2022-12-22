package factorymethod;

public class RoadTransport extends TransPort {
    @Override
    public Status CreateStatus() {
        return new TruckStatus();
    }
}
