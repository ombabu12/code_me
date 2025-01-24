public class recursion_fibonnaci {
public static void main(String[] args) {
    int n=6;
    int n1=0;
    int n2=1;
    int n3=0;
    for (int i =2; i <=n; i++) {
        n3=n1+n2;
        
        n1=n2;
        n2=n3;
    }
    System.err.println(n3);
    
    // System.err.println(fib(n));
}
// public  static int fib(int n){
// if(n==0||n==1){
//     return n;
// }

//     int f1=fib(n-1);
//     int f2=fib(n-2);
//     return f1+f2;
// }
}
