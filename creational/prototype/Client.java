package prototype;

public class Client {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.load();
        Employees employees1 = employees.clone();
        employees1.printEmp();
    }
}
