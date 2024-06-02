class a{
    public void display(){
        System.out.println("hello");
    }
}
class b extends a{
    public void display2(){
        System.out.println("one");
    }
}
public class InheritanceSingleLevel {
    public static void main(String[] args) {
        b obj = new b();
        obj.display();
        obj.display2();
    }
}
