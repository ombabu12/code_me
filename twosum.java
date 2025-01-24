public class twosum {
    public static int[] twoosum(int []x,int n,int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(x[i]+x[j]==target){
                    System.err.println("["+i+" "+j+"]");
                }
            }
        }
        return new int[] {0,1};
    }
public static void main(String[] args) {
    int ar[]={3,2,4};
    int n=ar.length;
    int target=6;
    twoosum(ar, n, target);
}
}
