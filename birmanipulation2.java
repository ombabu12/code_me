
import java.util.Scanner;

public class birmanipulation2 {
public static void main(String[] args) {
    Scanner c=new Scanner(System.in);
    System.err.print("enter the value of opertaion 0 or 1 only==>");
    int opr=c.nextInt();

    int n=5;
    int pos=2;
    int bitmask=1<<pos;
    if(opr==1){
        int newnum=bitmask|n;
        System.err.println(newnum);
    }
    else{
        int comp=~(bitmask);
        int neunum=comp&n;
        System.err.println(neunum);
    }
}
}
