package abstractfactory;

public class Client {
    public static void main(String[] args) {
        Starter starter;
        starter = new WindowsStarter();
        starter.Start();
        starter = new LinuxStarter();
        starter.Start();
    }
}
