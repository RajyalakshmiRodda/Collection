import java.util.*;
public class Methods {
	public static void main(String[] args) {
	    ArrayList <Integer> n=new ArrayList<>();
	    n.add(10);
	    n.add(20);
	    n.add(30);
	   	System.out.println("adding : " +n);
	   	Collections.reverse(n);
	   	System.out.println("reverse: " +n);
	   	Collections.swap(n,0,2);
	   	System.out.println("swapping: " +n);
	   	Collections.min(n);
	   	System.out.println("minimum: " +n);
	   	Collections.max(n);
	   	System.out.println("maximum: " +n);
	   	Collections.replaceAll(n,10,15);
	   	System.out.println("replace all: " +n);
	   	Collections.sort(n);
	   	System.out.println("sorting: " +n);
	   	Collections.rotate(n,2);
	   	System.out.println("rotate: " +n);
	   	Collections.reverseOrder();
	   	System.out.println("reverse order: " +n);
	   	Collections.shuffle(n);
	   	System.out.println("shuffle: " +n);
	}
}
