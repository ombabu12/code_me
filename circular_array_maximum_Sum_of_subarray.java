public class circular_array_maximum_Sum_of_subarray {
public static void main(String[] args) {
    int []ar={8,-8,9,-9,10,-11,12};
    int n=ar.length;
    System.err.println(maxSum_circular_array(ar, n));
}
public static int maxSum_circular_array(int ar[],int n){
    int linear_sum=kadens(ar, n);
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=ar[i];
        ar[i]=-ar[i];
    }
    int mid=kadens(ar, n);
    int circular_sum=sum+mid;
    return Math.max(linear_sum, circular_sum);
}
public static int kadens(int ar[],int n){
    int max=Integer.MIN_VALUE;
    int curr_sum=0;
    for (int i = 0; i < n; i++) {
        curr_sum+=ar[i];
        max=Math.max(max, curr_sum);
        if(curr_sum<0){
            curr_sum=0;
        }
    }
    return max;
}
}
