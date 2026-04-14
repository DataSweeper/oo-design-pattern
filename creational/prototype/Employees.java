package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    private List<String> empList;
    public Employees() {
        this.empList = new ArrayList<>();
    }

    public void load() {
        this.empList.add("siva");
        this.empList.add("lava");
    }
    public void printEmp() {
        for (String emp: empList) {
            System.out.println(emp);
        }
    }

    @Override
    public Employees clone() {
        try {
            Employees clone = (Employees) super.clone();
            clone.empList = List.of("Siva", "Mugin");
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
