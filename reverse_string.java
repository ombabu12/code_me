public class reverse_string {
    /*public static String reverse(String str){
        String newstr="";
        for (int i = str.length()-1; i >=0; i--) {
            newstr+=str.charAt(i);
        }
        return newstr;
    }*/
    public static char[] revesre(char ch[],int n){
        /*int start=0,end=n-1;
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }*/
        
        for (int i = 0; i <n/2; i++) {
            char temp=ch[i];
            ch[i]=ch[n-i-1];
            ch[n-i-1]=temp;
            
        }
        return ch;
    }
    public static void main(String[] args) {
        /*String str="the sky is blue";
        System.err.println(reverse(str));*/

        char ch[]={'h','e','l','l','o'};
        int n=ch.length;
        System.err.println(n);
        System.err.println(revesre(ch, n));
    }

}
