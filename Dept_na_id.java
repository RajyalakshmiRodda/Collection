import java.util.*;
class Department {
    private String name;
    private int id;
    public Department(String name,int id) {
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Department [name=" + name + ", id=" + id + "]";
    }
}
public class Dept_na_id {
    public static void main(String[] args) {
        List<Department> d=new ArrayList<>();
        Department d1=new Department("raji",1);
        Department d2=new Department("chinna",5);
        Department d3=new Department("veda",7);
            d.add(d1);
            d.add(d2);
            d.add(d3);
     Collections.sort(d,Comparator.comparingDouble(Department::getId));
        for (Department r:d) {
            System.out.println(d);
        }
    }
}

