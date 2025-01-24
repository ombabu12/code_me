public class dice {
    public static void printans(int n,int curr,String ans){
        if(curr==n){
            System.err.print(ans+" ");
            return;
        }
        if(curr>n){
            return;
        }
        printans(n, curr+1, ans+1);
        printans(n, curr+2, ans+2);
        printans(n, curr+3, ans+3);
    }
public static void main(String[] args) {
    int n=4;
    printans(n, 0, "");

}
}
