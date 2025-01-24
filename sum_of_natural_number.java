
import java.util.Scanner;

public class sum_of_natural_number {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.err.print("enter the value of n: ");
     int n=scn.nextInt();

     System.err.println(N_N(n));

}
public static int N_N(int n){
    if(n==1){
        return 1;
    }
    int x=N_N(n-1);
    return x+n;
}
}
