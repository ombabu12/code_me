public class recursion3 {
public static void main(String[] args) {
    int a=3;
    int b=4;
    System.err.println(power(a,b));
}

public static int power(int a,int b){
    if(b==0){
        return 1;
    }
    int ans=power(a,b-1);
    return ans*a;
}
}
