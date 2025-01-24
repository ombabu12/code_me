public class recursion_no_two_consicutive_head {
public static void main(String[] args) {
    int n=3;
    String ans="";
    toss(n, ans);
}
public static void toss(int n,String ans) {
    if(n==0){
        System.err.println(ans);
        return;
    }
    if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){

    toss(n-1,ans+"H");
}
    toss(n-1,ans+"T");
}
}
