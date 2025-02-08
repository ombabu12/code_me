public class sqrt {
    public static int sqrts(int x){
        int l=1;
        int r=x;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((mid)<=(x/mid)){
                ans= mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        
        }
                return ans;
    }
public static void main(String[] args) {
    System.out.println(sqrts(2147395599));
}
}
