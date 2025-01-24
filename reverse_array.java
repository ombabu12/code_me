
import java.util.Arrays;

public class reverse_array {
    /*public static void reverse(int au[],int n){
        for (int i = 0; i <n/2; i++) {
            int temp=au[i];
            au[i]=au[n-i-1];
            au[n-i-1]=temp;
        }
        System.err.println(Arrays.toString(au));
    }
public static void main(String[] args) {
    int au[]={23,45,6,78,90};
    int n=au.length;
    reverse(au, n);
}*/
public static void main(String[] args) {
    int ar[]={23,45,6,78,90};
    int n=ar.length;
    int br[]=new int[n];
    for (int i = 0; i <n; i++) {
        br[i]=ar[n-i-1];
    }
    System.err.println(Arrays.toString(br));
}
}
