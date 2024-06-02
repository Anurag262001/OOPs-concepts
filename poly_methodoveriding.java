class a{
        Object one(){
        System.out.println("this is class a");
        return "a";
    }
}
class b extends a{
      public String one() throws ArithmeticException{
        System.out.println("thhis is class b");
        return "b";
    }
}
public class poly_methodoveriding {
    public static void main(String[] args) {
        b obj = new b();
        obj.one();
        a obj2 = new a();
        obj2.one();
    }
}
/* if parent class donot throw any type of then child class can throw only unchecked exception
 * if parent class throw any exception then  child class should throw same level exception or same exception if child not throwing any type of exception then also there is not problem in it
 * 
 * 
 * 
 * 
*/