
import java.util.Scanner;

public class t2d_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the no of row");
        int n=sc.nextInt();
        System.err.println("enter the no of column");
        int m=sc.nextInt();
        
        System.err.println("enter the value of row");
        int p=sc.nextInt();
        System.err.println("enter the value of column");
        int q=sc.nextInt();
       
        int [][]arr=new int[n][m];
        int [][]ars=new int[p][q];
        if(m==p){
            System.err.println("enter value in 2d array 1");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j]=sc.nextInt();   
            }
            
        }
        System.err.println("enter value in 2d array 2");
        for (int i = 0; i <p; i++) {
            for (int j = 0; j <q; j++) {
                ars[i][j]=sc.nextInt();
            }
        }
    
        System.err.println("mutilication of two matrix is :");
        int mul[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <q; j++){
                mul[i][j]=0;
               for (int k = 0; k <m; k++) {
                   mul[i][j]=mul[i][j]+(arr[i][k]*ars[k][j]);
               }
            }
        }
    

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.err.print(mul[i][j]+" ");
            }
            System.err.println();
            
        }
    }
    else{
        System.err.println("invalid input");
    }
    }

}
