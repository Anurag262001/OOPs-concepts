class a{
    public void hi(int g){
     System.out.println("hi");
    }
}
public class test extends a {
   public void hi(int d){
    System.out.println("one");
   }
    public static void main(String[] args) {
        test obj = new test();
        obj.hi(2);
    }
}
