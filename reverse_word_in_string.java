public class reverse_word_in_string {
    public static String reverseword(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        }
public static void main(String[] args) {
    String s="the sky is blue";
    System.err.println(reverseword(s));
    
}
}
