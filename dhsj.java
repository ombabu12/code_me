class sent1{
    void m1()
    {
        System.out.println("m1__A");
    }
   void m2()
    {
        System.out.println("m2__a");
        this.m1();
        m1();
    

    }
}
public class dhsj {
    public static void main(String[] args) {
        sent1 s=new sent1();
        s.m2();
    }

}
