public class three_sum {
    public static int[] threeSum(int nums[],int n,int target){
        for(int i=0;i<n-2;i++){
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(nums[i]+nums[j]+nums[k]==target){
                        System.err.println("["+nums[i]+" "+nums[j]+" "+nums[k]+"]");
                    }
                }
                
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        int n=nums.length;
        int target=0;
        threeSum(nums, n, target);
    }

}
