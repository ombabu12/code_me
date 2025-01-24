public class remove_dupliacte_element_2 {
    public static int duplicate(int []nums){
        int count =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[i+2]){
                continue;
                }
            
            else{
                nums[count]=nums[i];
                count++;
            }
            
        }
        return count;
    }
public static void main(String[] args) {
    int nums[]={0,0,1,1,1,1,2,2,2,3};
    System.err.println(duplicate(nums));
}
}
