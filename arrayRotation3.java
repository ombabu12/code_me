import  java.util.*;
class demmoo{
     static int[]  leftRotation(int ary[],int r)
    {
        int i,j ,prev ,temp;
        for (i = 0; i < r; i++) {
            prev=ary[0];
            for ( j=ary.length-1;j>=0;j--) {
                temp=ary[j];
                ary[j]=prev;
                prev=temp;  
                
            }

            
        }
        return ary;


    }
}
public class arrayRotation3 {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,7};
        Scanner sn=new Scanner(System.in);
        System.err.println("enter the no of rotations:");
        int r=sn.nextInt();
        System.err.println("aray before rotation "+ Arrays.toString(ary));
        ary=demmoo.leftRotation(ary, r);
        System.err.println("array after rotation "+ Arrays.toString(ary));



        
    }
}
