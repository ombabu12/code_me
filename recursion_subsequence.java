public class recursion_subsequence {
public static void main(String[] args) {
    String ques="abc";
    String ans="";
    subseq(ques, ans);
    System.err.println(count);

}
static int count=0;
public static void subseq(String ques,String ans){
    
    if(ques.length()==0){
        System.err.println(ans);
        count++;
        return;
    }
    char ch=ques.charAt(0);
    subseq(ques.substring(1),ans);
    subseq(ques.substring(1), ans+ch);

}
}
