public class bitmanipulation1 {
    public static void main(String[] args) {
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;
        int comp=~(bitmask);

       int newnum=comp & n;
       System.err.println(newnum);
    }

}
