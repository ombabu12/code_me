

import java.util.Scanner;

class demoe{
    static int sums(int n)
    {

        if(n==1)
        {
        return 1;
        }
        else
        {
            return n+sums(n-1);
        }
        
    }
}

public class fgh {
    public static void main(String[] args) {
        Scanner rt = new Scanner(System.in);
            int n=rt.nextInt();
            System.out.println(demoe.sums(n));
        }

}
