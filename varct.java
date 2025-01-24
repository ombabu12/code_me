class Ak{
     Ak() {
     this(10);
     System.out.println("A-0-arg-con");
     }
     Ak(int i) {
     this(22.22f);
     System.out.println("A-int-param-con");
     }
     Ak(float f) {
     this(33.3333);
     System.out.println("A-float-param-con");
     }
     Ak(double d) {
     System.out.println("A-double-param-con");
     }
     }
    
public class varct {
    public static void main(String[] args) {
        Ak xz =new Ak();
    }

}
