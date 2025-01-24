
import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        System.err.println("enter the value of n");
        int n=sv.nextInt();
        int first=0;
        int second=1;
        int next;
        for(int i=0;i<n;i++){
            System.err.print(first+ " ");
            next=first+second;
            first=second;
            second=next;

        }
    }

}
