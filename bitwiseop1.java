public class bitwiseop1 {
public static void main(String[] args) {
    int n=5;
    int pos=1;
    int bitmask=1<<pos;
    int newnumber=bitmask|n;
    System.err.println(newnumber);
}
}
