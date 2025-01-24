
import java.util.Scanner;

public class arraylinearsearch {
    public static int  ls(int a[],int n,int target){
        for (int i = 0; i < n; i++) {
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.err.println("enter the value of number of elements in an array");
    int n=sc.nextInt();
    System.err.println("enter elements in an array");
    int a[]=new int[n];
    for (int i = 0; i < n; i++) {
        a[i]=sc.nextInt();
    }
    System.err.println("enter the target value ");
    int target=sc.nextInt();
    System.err.print("the index of target value is"+" ");
    System.err.println(ls(a, n, target));
}
}
