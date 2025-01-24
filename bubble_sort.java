import java.util.Arrays;
class hwl{
    static int[] b_sort(int ar[],int n){
        for (int i = 0; i <n-1; i++) {
            for(int j=0;j<n-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        return ar;
    }

}

public class bubble_sort {
    /*public static void b_sort(int ar[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.err.println(Arrays.toString(ar));
    }*/
    public static void main(String[] args) {
        int ar[]={5,4,1,3,2};
        int n=ar.length;
        int[] res=hwl.b_sort(ar, n);
        System.err.println(Arrays.toString(res));

        
    }
}



