package singleton;

public class Client {
    public static void main(String[] args) {
        Application application = Application.getApplication();
        application.getId();
        Application application1 = Application.getApplication();
        application1.getId();
    }
}
