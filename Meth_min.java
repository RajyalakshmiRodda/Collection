import java.util.*;
public class Meth_min {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(20);
        l.add(45);
        l.add(60);
        l.add(10);
        l.add(90);
      System.out.println(l);
      System.out.println("by using min method");
      System.out.println(Collections.min(l));
      System.out.println("by using max method");
      System.out.println(Collections.max(l));
    }
}