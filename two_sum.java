
import java.util.Arrays;

public class two_sum {
public static void main(String[] args) {
    int nums[]={2,7,11,15};
    int target=15;
    System.err.println(Arrays.toString(twosum(nums, target)));

}
public static int[] twosum(int nums[],int target){
    for (int i = 0; i <nums.length; i++) {
        for (int j = i+1; j <nums.length; j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
}
}
