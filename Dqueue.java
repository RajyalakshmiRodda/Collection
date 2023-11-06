import java.util.*;
public class Dqueue {
  public static void main(String[] args) {
    Deque<Integer> d=new ArrayDeque<>();
    d.addFirst(5);
    d.offerFirst(15);
    d.addLast(10);
    d.offerLast(20);
    System.out.println(d);
    System.out.println(d.peekFirst());
    System.out.println(d);
    System.out.println(d.peekLast());
    System.out.println(d);
    System.out.println(d.pollFirst());
    System.out.println(d);
    System.out.println(d.pollLast());
    System.out.println(d);
    System.out.println(d.removeFirst());
    System.out.println(d);
    System.out.println(d.removeLast());
    // System.out.println(d);
  }
}