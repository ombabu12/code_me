
class empl {

    String eid = "E-111";
    String ename = "Durga";
    float esal = 50000.0f;
    String eaddr = "Hyd";
    String eemail = "durga@durgasoft.com";
    String emobile = "91-9988776655";

    public String toString() {
        System.err.println("employee details:");
        System.err.println("--------------------------------------------");
        System.out.println("Employee Id :" + eid);
        System.out.println("Employee Name :" + ename);
        System.out.println("Employee Salary :" + esal);
        System.out.println("Employee Address :" + eaddr);
        System.out.println("Employee Email :" + eemail);
        System.out.println("Employee Mobile :" + emobile);
        System.err.println("--------------------------------------------");

        return "";
    }
}


public class tost {
    public static void main(String[] args) {
        empl em=new empl();
        System.out.println(em);
    }

}
