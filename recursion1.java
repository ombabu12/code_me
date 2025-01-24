public class recursion1 {
    public static void main(String[] args) {
        int n=5;
        System.err.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fact=factorial(n-1);
        return fact*n;
    }

}
