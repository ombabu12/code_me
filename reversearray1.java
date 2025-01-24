import java.util.Arrays;

public class reversearray1 {
    
    /*public static void reverse(int []x,int s,int e,int n){
        
        if(s<e){
            int temp=x[s];
            x[s]=x[e];
            x[e]=temp;
            reverse(x,++s, --e,n);

        }
    }*/
    public static void main(String[] args) {
        int []a={0,2,4,1,3};
        int n=a.length;
        int s=1,e=n-1;
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s=s+1;
            e=e-1;
        }
        System.err.println(Arrays.toString(a));
        /*reverse(a, 1, a.length-1,n);
       
        System.err.println(Arrays.toString(a));*/
        
    }

}
