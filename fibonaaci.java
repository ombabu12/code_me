
public class fibonaaci {

    public static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
            
        
    }
    public static void main(String[] args) {
        int n=7;
        if(n<0){
            System.err.println("fibonnaci is not defined");
        }
        else{
            System.err.print("fibonnaci of "+n+"length is ===>");
        }
        for(int i=0;i<n;i++){
            System.err.print(fib(i)+"  ");
        }

        
    }
    /*public static void main(String[] args) {
        System.err.println("enetr the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int first=0;int second =1;
        int next;
        System.err.print("[ ");
        for (int i = 0; i <= n; i++) {
            System.err.print(+first+"  ");
            next=first+second;
            first =second;
            second= next;
        }
        System.err.println("]");
        
        int n=23579;
        n=n%10;
        System.err.println(n);
    }*/

}
