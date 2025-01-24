
import java.util.Arrays;
import java.util.Scanner;

public class arrayrotate {
    public static int[] leftrotate(int arr[],int n){
        for (int i = 0; i <n; i++) {
            int prev=arr[0];
            for(int j=arr.length-1;j>=0;j--){
                int temp=arr[j];
                arr[j]=prev;
                prev=temp;
            }
        }
        return arr;
    }

    public static int[] left(int arr[],int n){
        for (int i = 0; i <n; i++) {
            int temp=arr[0];
            for (int j = 0; j <arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }
public static void main(String[] args) {
    int []arr={1,2,3,4,5};
    System.err.print("enter the number of rotation: ");
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    System.err.println(Arrays.toString(left(arr, n)));

}
}
