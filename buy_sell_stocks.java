public class buy_sell_stocks {
    public static int buysell(int []price,int n){
        int buystocks=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i <n; i++) {
            if(buystocks<price[i]){
                int profit=price[i]-buystocks;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buystocks=price[i];
            }
        }
        return maxprofit;
    }
public static void main(String[] args) {
    int price[]={7,1,5,3,6,4};
    int n=price.length;
    System.err.println(buysell(price, n));

}
}

