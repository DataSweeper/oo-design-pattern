package prototype;

import java.util.ArrayList;

public class Employees implements Cloneable{
    private ArrayList<String> empList;
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
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
