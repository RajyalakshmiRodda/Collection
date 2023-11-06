class Co{
  static String name="raji";
  void display(){
    System.out.println("hello java");
  }
}
public class Sta_Var{
  public static void main(String[] args){
    System.out.println("access static variable");
    Co c=new Co();
    c.display();
  }
}
