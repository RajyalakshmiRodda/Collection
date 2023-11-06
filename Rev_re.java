import java.util.*;
public class Rev_re {
    public static void main(String[] args) {
        List<Integer> m= new ArrayList<>();
        m.add(10);
        m.add(20);
        m.add(60);
        m.add(30);
        m.add(40);
        m.add(50);
      System.out.println(m);
      System.out.println("by using reverse method");
        Collections.reverse(m);
        System.out.println(m);
      System.out.println("by using replace all method");
      Collections.replaceAll(m,50,100);
        System.out.println(m);
      System.out.println("by using sort method");
      Collections.sort(m);
      System.out.println(m);
    }
}
