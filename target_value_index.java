import java.util.Scanner;

public class target_value_index {
    public static void index(int n,int a[],int target){
        for (int i = 0; i < n; i++) {
            if(a[i]==target){
                System.err.print(" the target value index is ===> "+ i );
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the value of n===>");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.err.println("enter value in array==>");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.err.print("the array is==>");
        for (int j = 0; j < n; j++) {
            System.err.print(+a[j]+" ");
    }
    System.err.println();
    System.err.print("Enter the target value is===>");
        int target =sc.nextInt();
        index(n, a, target);
}
}
