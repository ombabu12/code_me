
import java.util.Scanner;

public class removeelement {

    public static int removeele(int[] v, int val) {
        int count = 0;
        int l = v.length;
        for (int i = 0; i < l; i++) {
            if (v[i] != val) {
                v[count] = v[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.err.println("enter the no of  elements in an array:");
        int n = scn.nextInt();
        int v[] = new int[n];
        System.err.println("enter elements in array");
        for (int i = 0; i < n; i++) {
            v[i] = scn.nextInt();
            System.err.println(v[i]);
        }
        System.err.println("enter the value of val");
        int val = scn.nextInt();
        System.err.print("remaining elements after removal ==>");
        System.err.print(removeele(v, val));

    }

}
