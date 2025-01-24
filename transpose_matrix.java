import java.util.Scanner;

public class transpose_matrix {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.err.println("enter the no of rows ");
    int r=scn.nextInt();
    System.err.println("enter the no of column");
    int c=scn.nextInt();
    int mat[][]=new int[r][c];
System.err.println("enter elements in matrix");
    for (int i = 0; i <r; i++) {
        for (int j = 0; j < c; j++) {
            mat[i][j]=scn.nextInt();
        }
    }
System.err.println("the matrix is");
for (int i = 0; i <r; i++) {
    for (int j = 0; j <c; j++) {
        System.err.print(mat[i][j]+" ");
    }
    System.err.println();
}
System.err.println("the transpose of matrix is :");
int transpose[][]=new int[c][r];
for (int i = 0; i <r; i++) {
    for (int j = 0; j <c; j++) {
         transpose[j][i]=mat[i][j];
    }
}
for (int i = 0; i <c; i++) {
    for (int j = 0; j <r; j++) {
         System.err.print(transpose[i][j]+" ");

  }
    System.err.println();
}
}
}
