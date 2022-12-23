package singleton;

public class Application {
    static Application application;
    private static int id;
     public static synchronized Application getApplication() {
        if (application == null) {
            id += 1;
            application = new Application();
            return application;
        } else {
            return application;
        }
    }
    public void getId() {
        System.out.println(id);
    }
}
