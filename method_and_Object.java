package methods_and_Object;

public class method_and_Object {
    int age;
    String color;
    /* access-modifier(public, private, default, protected)  return-type  methodName */
    public void print(){
        System.out.println("hello world");
    }
    private void print2(){
        System.out.println("hello world two");
    }
    protected void print3(){
        System.out.println("hello world three");
    }
    void print4(){
        System.out.println("hello world four");
    }
    void gettiing_value(String a,int c){
        color = a;
        age = c;
    }
    void display_value(){
        System.out.println(age);
        System.out.println(color);
    }

    public static void main(String[] args) {
        /* object
         * class-name  object-name(unique) = new-keyword constructor-name
         */
        method_and_Object obj = new method_and_Object();
        obj.print();
        obj.print2();
        obj.print3();
        obj.print4();
        method_and_Object obj2 = new method_and_Object();
        obj2.age = 10;
        obj2.color = "pink";
        System.out.println(obj2.age+" "+obj2.color);
        method_and_Object obj3 = new method_and_Object();
        obj3.gettiing_value("green", 0);
        obj.display_value();
    }
}
