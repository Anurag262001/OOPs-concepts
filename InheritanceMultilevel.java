class a{
    void one(){
        System.out.println("one");
    }
}
class b extends a{
    public void two(){
        System.out.println("two");
    }
}
class c extends b{
    protected void three(){
        System.out.println("thee");
    }
}
class d extends c{
    private void four(){
        System.out.println("four");
    }
}
public class InheritanceMultilevel {
    public static void main(String[] args) {
        a  obj =  new a();
        obj.one();
        /* obj.two();
        obj.three();
        obj.four(); */
        b obj1 = new b();
        obj1.one();
        obj1.two();
       /*  obj1.thee();
        obj1.four(); */
        c obj2 = new c();
        obj2.one();
        obj2.two();
        obj2.three();
/* private can access on its own parameters */
    }
}
