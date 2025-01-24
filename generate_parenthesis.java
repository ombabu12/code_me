
import java.util.ArrayList;
import java.util.List;

public class generate_parenthesis {
public static void main(String[] args) {
    int n=3;
    String ans="";
    int open=0;
    int close=0;
    List<String> ll=new ArrayList<>();
    genearte_p(n, ans, open, close, ll);
    System.err.print(ll);
}

public static void genearte_p(int n,String ans,int open,int close,List<String>ll){
    if(open==n && close==n){
        ll.add(ans);
        return;
    }
    if(open>n || close>open){
        return;
    }
    genearte_p(n, ans+"(", open+1, close,ll);
    genearte_p(n, ans+")", open, close+1,ll);
}
}
