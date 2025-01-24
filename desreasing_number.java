public class desreasing_number {
    public static void dec(int n){
        if(n==1){
            System.err.println(n);
            return;
        }
        System.err.print(n+" ");
        dec(n-1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }

    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);


    }
public static void main(String[] args) {
    int n=5;
    /*dec(n);*/
    System.err.println(fibo(n));
    
}
}
