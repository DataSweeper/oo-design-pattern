package factorymethod;

public class TruckStatus implements Status {
    @Override
    public String getStatus() {
        return "NewYork";
    }
}
