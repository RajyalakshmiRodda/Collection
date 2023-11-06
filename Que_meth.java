import java.util.*;
public class Que_meth {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println("the queue elemets are");
        System.out.println(q);
        System.out.println("by using peek method");
        int a=q.peek();
        System.out.println(a);
        System.out.println("by using poll method");
        int b=q.poll();
        System.out.println(b);
        System.out.println("by using element method");
        int c=q.element();
        System.out.println(c);
        System.out.println("by using remove method");
        q.remove(20);
        System.out.println(q);
        System.out.println("remaining elements in the queue");
        System.out.println(q);
}
}