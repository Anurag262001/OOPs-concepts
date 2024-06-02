package Inheritance;

class a{
       protected void dis(){
        System.out.println("display");
    }
}
class b extends a {
    public void dis2(){
        System.out.println("display2");
    }
}
public class Main {
    public static void main(String[] args) {
    b obj = new b();
    obj.dis();
    obj.dis2(); 
    }
}
