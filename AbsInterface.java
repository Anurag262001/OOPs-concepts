interface i1{
    int a = 10;
    /* public abstract */ void show();
    static void show3(){
        System.out.println("hello three");
    }
   default void show10(){
        System.out.println("show");
    }
    /* private show4(){
        System.out.println("private");
    } */
}
public class AbsInterface implements i1{
   public void show(){
        System.out.println("hello");
    } 
    public static void main(String[] args) {
        AbsInterface obj = new AbsInterface();
        obj.show();
        obj.show10();
        i1.show3();
    }
}
