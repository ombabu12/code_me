import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the no of row");
        int n=sc.nextInt();
        System.err.println("enter the no of column");
        int m=sc.nextInt();
        int [][]arr=new int[n][m];

        System.err.println("enter value in 2d array 1");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j]=sc.nextInt();   
            }
            
        }

        
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.err.print(arr[i][j]+" ");  
            }
            System.err.println();
        }

        int trans[][]=new int[m][n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                trans[i][j]=arr[j][i];
            }
        }
        System.err.println("transpose matrix is ===>");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.err.print(trans[i][j]+" ");
            }
            System.err.println();
        }
    }

}
