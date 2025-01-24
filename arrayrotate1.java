
import java.util.Arrays;
import java.util.Scanner;

public class arrayrotate1 {
    public static int[] rightrotate(int a[],int r){
        for (int i =0; i <r; i++) {
            int prev=a[a.length-1];
            for(int j=0;j<a.length;j++){
                int temp=a[j];
                a[j]=prev;
                prev=temp;
            }
        }
        return a;
    }

    public static int[] right(int a[],int r){
        for (int i = 0; i <r; i++) {
            int temp=a[a.length-1];
            for (int j=a.length-1;j>0;j--) {
               a[j]=a[j-1];
            }
            a[0]=temp;
        }
        return a;
    }
public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    Scanner sc=new Scanner(System.in);
    System.err.print("enter the number of rotation: ");
    int r=sc.nextInt();
    System.err.println(Arrays.toString(right(a, r)));
}
}
