public class AllAboutStatic {
    /* we can use static for class level variables (instance var) */
    /* sttaic class can be made but only for inner class */
    /* static method */
    /* static block */
    static int a= 10;
    void display(){
        System.out.println(a);
    }
    static void s(){
        /* static methods can call only other static methods and cannot call a non static method*/
        s();
        System.out.println("s");
    }
    static void d(){
        System.out.println("d");
    }

    public static void main(String[] args) {
        AllAboutStatic o = new AllAboutStatic();
        o.display();
        AllAboutStatic.d(); 
        /* or we can directly call it by class name */
        /* static method can access only static data */
        System.out.println(AllAboutStatic.a);
    }
}
