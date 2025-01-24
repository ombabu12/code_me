
import java.util.Scanner;

public class exponent {
    public static void power(int x,int n){
        int result=1;
        for (int i = 0; i < n; i++) {
            result=result*x;
            
        }
        System.err.println("the result value is ==> "+ result);
    }
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        System.out.print("enter the value of x==>");
        int x=sh.nextInt();
        System.err.print("enter the value of n==>");
        int n=sh.nextInt();
        exponent ex=new exponent();
        ex.power(x, n);

        
    }

}
