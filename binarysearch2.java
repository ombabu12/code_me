public class binarysearch2 {
    public static int fun(int n,int k){
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(Math.pow(mid, k)<=n){
                 ans= mid;
                 lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    int k=3;
    int n=146;
    System.err.println(fun(n, k));
}
}
