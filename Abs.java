abstract class a {
    int no = 10;
    static int num =10;
    public a(){
        System.out.println(no);
    }
    void key(){
System.out.println("key");
    }
    /* cannot have abstract static method */
    abstract void key2();
    static void display(){
        System.out.println("print");
    }
     private void display2(){
        System.out.println("private method");
    } 
}


public class Abs extends a  {
    public void key2(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
       Abs obj  = new Abs();
       obj.key2();
       obj.display();
       
    }
}
