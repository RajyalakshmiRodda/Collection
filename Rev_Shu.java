import java.util.*;
public class Rev_Shu {
    public static void main(String[] args) {
        List<String> r= new ArrayList<>();
        r.add("10");
        r.add("15");
        r.add("20");
        r.add("25");
        r.add("30");
      System.out.println(r);
      System.out.println("by using rotate method");
        Collections.rotate(r,2);
        System.out.println(r);
      System.out.println("by using shuffle method");
        Collections.shuffle(r);
        System.out.println(r);
    }
}
