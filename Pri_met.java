import java.util.*;
public class Pri_met {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(5);
        p.add(10);
        p.add(15);
        p.add(20);
        System.out.println("the priority queue elemets are");
        System.out.println(p);
        System.out.println("by using peek method");
        int a=p.peek();
        System.out.println(a);
        System.out.println("by using poll method");
        int b=p.poll();
        System.out.println(b);
        System.out.println("by using element method");
        int c=p.element();
        System.out.println(c);
        System.out.println("by using remove method");
        p.remove(20);
        System.out.println(p);
        System.out.println("remaining elements in the priority queue");
        System.out.println(p);
}
}