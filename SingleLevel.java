
class a{
   public void display(){
        System.out.println("hello");
    }
}
class b extends a{
   public void display2(){
        System.out.println("hello2");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        b obj = new b();
        obj.display2();
    }
}
