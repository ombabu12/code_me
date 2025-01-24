

import java.util.Arrays;
import java.util.Scanner;
class deps{
     public static int[] rotateleft(int a[],int r)
    {
        

        for(int i=0;i<r;i++){
            int prev=a[0];
            for(int j=a.length-1;j>=0;j--){
                int temp=a[j];
                a[j]=prev;
                prev=temp;
            }
        }


        return a;

    }
}

public class array_rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []a={1,2,3,4,5};
        System.out.println("enter no of rotaion");
        int r=sc.nextInt();
        
        System.err.println("before rotation=>"+Arrays.toString(a));
        a=rotateleft(a,r);
        System.err.println("after rotation=>"+Arrays.toString(a));

    }

    private static int[] rotateleft(int[] a, int r) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   

}
