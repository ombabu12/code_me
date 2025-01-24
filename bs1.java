
import java.util.Arrays;



public class bs1 {
public static void main(String[] args) {
   int a[]={2,3,6,1,7,4,9,5};
   int n=a.length;
   int big=a[0];
   for (int i = 0; i <n-1; i++) {
    for (int j = 0; j <n-1; j++) {
        
    
       if(a[j]>a[j+1]){
        int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
       }
       
   }
}
System.err.println(Arrays.toString(a));
}
}
