package factorymethod;

public class ShipStatus implements Status{
    @Override
    public String getStatus() {
        return "Antarctica";
    }
}
