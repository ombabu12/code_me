public class binarysearch1 {
    public static int binsearch(int a[],int item){
        int low=0;
        int high=a.length-1;
        
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(a[mid]==item){
                return mid;
            }
            else if(a[mid]>item){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int fun(int k,int n,int x){
        while(Math.pow(x, k)<=n){
            x++;
        }
        return x-1;
    }
public static void main(String[] args) {
    int a[]={2,3,4,5,7,9,11,13,14,15,18,20,21};
    int item=13;
    int k=3;
    int n=146;
    int x=0;
    System.err.println(fun(k, n, x));
    //System.err.println(binsearch(a, item));
}
}
