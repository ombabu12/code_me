public class recursion_toss_coin {
public static void main(String[] args) {
    int n=3;
    String ans="";
    tosscoin(n,ans);
}
public static void tosscoin(int n,String ans){
    if(n==0){
        System.err.println(ans);
        return;
    }
    
        
    tosscoin(n-1,ans+"H");
    tosscoin(n-1,ans+"T");
}
}
