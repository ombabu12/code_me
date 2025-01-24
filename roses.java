import java.util.Scanner;

public class roses {
    public static void deepak(int prices[],int roses,int money){
        for (int i = 0; i < roses; i++) {
            for (int j = i+1; j < roses-1; j++) {
                if(prices[i]+prices[j]==money){
                   System.err.println("Deepak should buy roses whose prices are"+ prices[i] +"and"+ prices[j]); 
                }
            }
        }
    }
public static void main(String[] args) {
    Scanner sv=new Scanner(System.in);
    System.err.println("enter the no of roses");
    int roses=sv.nextInt();
    System.err.println("prices of roses are");
    int prices[]=new int[roses];
    for (int i = 0; i < roses; i++) {
        prices[i]=sv.nextInt();
    }
    System.err.println("money to spend on roses");
    int money=sv.nextInt();
    deepak(prices, roses, money);

}
}
