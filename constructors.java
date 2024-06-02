package constructors;

public class constructors {
    int a;
    int b;
    public constructors(){
        System.out.println("hello");
    }
     constructors(int a,int b){
        this.a = a;
        this.b = b;
    }
  /* act as method not constructor */  void constructors(){
        System.out.println("hello");
    }
    //cannot be a final constructor
    /* final constructors(){

    } */
    public static void main(String[] args) {
        constructors obj = new constructors(1,2);
        constructors obj2 = new constructors(3,4);
        constructors obj3 = new constructors();
        obj3.constructors();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}


/* use to initlize the value*/
/* user-defined constructor
 * default-constructor(compilier make this constructor, )
 * paramerterized-constructor
 * 
 * 
 * 
 * dont have return type because when default constructor created it dont judge what will be the return type
 */
