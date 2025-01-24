public class vowel {
    public static void vowels(char i){
        
            if(i=='a'|| i=='e' ||i=='i' || i=='o' || i=='u'){
                System.err.println(i+"  is vowel.");
                
            }
            else{
                System.err.println(i+"  is consonent");
            }
        
    }
    
    public static void main(String[] args) {
    vowels('a');
}
}
