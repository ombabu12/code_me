
import java.util.Scanner;

public class targetsumpair {
    public static void sumpair(int ar[],int n,int target){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(ar[i]+ar[j]==target){
                    System.err.println(ar[i]+" and "+ar[j]);
                }
            }
        }
    }
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int ar[]=new int[n];
    for (int i = 0; i < n; i++) {
        ar[i]=scn.nextInt();
    }
    int target=scn.nextInt();
    sumpair(ar, n, target);
}
}
