package factorymethod;

abstract public class TransPort {

    public void getStatus() {
        Status status = CreateStatus();
        System.out.println(status.getStatus());
    }

    public abstract Status CreateStatus();
}
