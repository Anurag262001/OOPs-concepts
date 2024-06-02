public class Encapsulation {
    /* encapsulation */
    private int empid;
    public void setEmpid(int empid){
        this.empid  = empid;
    }
    public int getEmpid(){
        return empid;
    }
    public static void main(String[] args) {
        Encapsulation obj =  new Encapsulation();
        obj.setEmpid(10);
        int data = obj.getEmpid();
        System.out.println(data);
    }
}
/* warpping up od data and code acting on that data into a single unit */