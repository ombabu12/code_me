public class recursion2 {
    public static void main(String[] args) {
        int n=5;
        back_count(n);
    }
    public static void back_count(int n){
        if(n==0){
            return;
        }
        System.err.println(n);
        back_count(n-1);
       
        
        

    }

}
