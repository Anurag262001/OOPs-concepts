/* handle by compilier */
class poly_overloading{
    public int a(){
         System.out.println("method a");
        return 2;
    }
   /*  public void a(){
        System.out.println("hello"); 
    } */
    public void a(int a){
        System.out.println("method2 a");
    }
    public static void main(String[] args) {
        poly_overloading o  = new poly_overloading();
        int res = o.a();
        System.out.println(res);
        o.a(2);
        o.main(4);
    }
        public static void main(int c){
            System.out.println("hello");
        }
}


/* automatic promotion
 * byte->short and char->int->long->double and float->double
 */