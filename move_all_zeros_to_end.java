
import java.util.Arrays;



public class move_all_zeros_to_end {
public static void main(String[] args) {
    int arr[]={0,1,0,3,12};
   
    int n=arr.length;
    int ar[]=new int[n];
    int count=0;
   /* for (int i = 0; i <n-1; i++) {
        for (int j = 0; j<n-1; j++) {
        
            if(arr[j]==0){
                int sw=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=sw;
            
            }
        } 
    }
    
    for (int i = 0; i <n; i++) {
        System.err.print(arr[i]+" ");
    }*/
    for (int i = 0; i <n; i++) {
        if(arr[i]>0){
            arr[count++]=arr[i];
            
        }
    }
    System.err.println(count);
    for (int i =count; i<n; i++) {
        arr[i]=0;
    }
    System.err.println(Arrays.toString(arr));
   
}
    
    
    
}


