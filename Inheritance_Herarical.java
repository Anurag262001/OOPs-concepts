class a{
   public void one(){
        System.out.println("one");
    }
}
class b extends a{
    public void two(){
       System.out.println("two");
    }
}
class c extends a{
    public void three(){
        System.out.println("three");
    }
}
public class Inheritance_Herarical {
    public static void main(String[] args) {
        b obj = new b();
        obj.one();
        obj.two();
        c obj2 = new c();
        obj2.one();
        obj2.three();
    }
}
