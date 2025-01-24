public class bitwsieop {
public static void main(String[] args) {
    /*int decimal=10;
    String binary=Integer.toBinaryString(10);
    System.out.println("bianry==>"+ binary);

    int binarydecimal=Integer.parseInt(binary,2);
    System.err.println("decimal==>"+ binarydecimal);*/
     int n=5;
     int pos=3;
     int bitmask=1<<pos;

     if((bitmask & n)==0){
        System.err.println("bit was zero");
     }
     else{
        System.err.println("bit was one");
     }
}
}
