
import java.util.*;
class demo{
    static int[] rightRotation(int b[],int r){
        for (int i = 0; i < r; i++) {
            int prev=b[b.length-1];
            for (int j = 0; j <b.length; j++) {
                int temp=b[j];
                b[j]=prev;
                prev=temp;

                
            }
            
        }
        return b;

    }
}


public class arrayRotation2{
    public static void main(String[]args)
    {
        Scanner sh=new Scanner(System.in);
        System.out.println("enetr the no of rotation:");
        int r=sh.nextInt();

        int b[]={1,2,3,4,5};
        System.err.println("Before rotation==>"+ Arrays.toString(b));
        b=demo.rightRotation(b,r);
        System.err.println("after rotation=>"+Arrays.toString(b));
        

    }
}
