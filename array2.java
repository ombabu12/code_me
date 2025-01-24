
import java.util.Scanner;


public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int ar[]=new int[size];
        int sum=0;
        System.err.println("enter "+ size+"elements in array");
        for (int idx = 0; idx < ar.length; idx++) {
            ar[idx]=sc.nextInt(); 
           sum+=ar[idx];
        }
        
        System.out.println(sum);

    }

}
