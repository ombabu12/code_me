public class subarray {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int n=arr.length;
    int sum=0;
    for(int st=0;st<n;st++){
        for(int end=st;end<n;end++){
            for(int i=st;i<=end;i++){
                
                System.err.print(arr[i]);
            }
            System.err.print(" ");
        }
        System.err.println();
    }
    
}
}
