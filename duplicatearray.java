public class duplicatearray {
    
    public static int removeduplicatearray(int[] ar1){
        int n=ar1.length;
        int count=0; 
        for(int i=0;i<n;i++){
            if(i<n-1 && ar1[i]==ar1[i+1]){
                continue;
            }
            else{
                ar1[count]=ar1[i];
                count++;

            }
        

    }
        return count;
}
    public static void main(String[] args) {

        
        int ar1[]={1,2,3,3,2};
        

        System.err.println(removeduplicatearray(ar1));

        
        }

}
