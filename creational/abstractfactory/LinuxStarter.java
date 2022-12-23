package abstractfactory;

public class LinuxStarter implements Starter{

    @Override
    public void Start() {
        System.out.println("Linux Starter");
    }
}
