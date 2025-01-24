
import java.util.Arrays;
import java.util.Scanner;
class hel{
    static int[] rotateL(int ap[],int r){
        int temp,prev,i,j;
        for(i=0;i<r;i++){
            prev=ap[0];
            for(j=ap.length-1;j>=0;j--){
                temp=ap[j];
                ap[j]=prev;
                prev=temp;
            }
        }
        return ap;
    }
}
public class rotateleft {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int ap[]={1,2,3,4,5};
        System.err.println("Enter the no of rotation");
        int r=scn.nextInt();
        System.err.println("before rotation==>"+Arrays.toString(ap));
        hel h=new hel();
        ap=h.rotateL(ap,r);
        System.err.println("after rotation==>"+Arrays.toString(ap));
    }

    

}
