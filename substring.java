public class substring {
    public static String substrings(String str,int si,int ei){
        String substr="";
        for (int i =si; i <ei; i++) {
            substr+=str.charAt(i);
        }
        return substr; 
    }

    public static String substring(String str,int s,int e){
        String substr="";
        for (int i = s; i <e; i++) {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void printsubstring(String s){
        for(int i=0;i<s.length();i++){
            for (int j =i+1; j <=s.length(); j++) {
                System.err.println(s.substring(i, j)); 
            }
        }
    }
public static void main(String[] args) {
    String str="helloworld";
    System.err.println(str.substring(0,7));
    //System.err.println(substrings(str, 0, 9));
    System.err.println(substring(str, 0, 10 ));
    printsubstring(str);
}
}
