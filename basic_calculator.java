
import java.util.Scanner;

public class basic_calculator {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        while(true){
        System.err.println("enter the operator");
        char ch = ob.next().trim().charAt(0);

        if (ch == '+' || ch == '*' || ch == '/' || ch == '-' || ch == '%') {
            System.err.println("enter the first umber");
            int num1 = ob.nextInt();
            System.err.println("enter the second number");
            int num2 = ob.nextInt();

            if (ch == '+') {
                System.err.println("ans ==>"+num1 + num2);
            }
            if (ch == '/') {
                if(ch!=0){
                    System.err.println("ans ==>"+"invalid");
                }
                System.err.println("ans ==>"+num1 / num2);
            }
            if (ch == '-') {
                System.err.println( num1 - num2);
            }
            if (ch == '*') {
                System.err.println("ans ==>"+num1 * num2);
            }
            if (ch == '%') {
                System.err.println("ans ==>"+num1 % num2);
            }
            

        }
        else if(ch=='x'||ch=='X'){
            
            break;
        }
        else{
            System.err.println("invalid input");
        }
    }
    }
}
