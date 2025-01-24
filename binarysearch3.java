import java.util.Arrays;

public class binarysearch3 {
    public static void main(String[] args) {
        int[] arr={2,3,4,8,1,56,34,89,12,45};
        int n=arr.length;
        int target=34;
        Arrays.sort(arr);
        System.err.println("array after sorting===>"+Arrays.toString(arr));
        System.err.println("target found at index : "+binarysearch(arr, n, target));

    }
    public static int binarysearch(int []arr,int n,int target){
        int s=0;
        int e=n-1;
        
        for(int i=0;i<n;i++){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;

    }

}
