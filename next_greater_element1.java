
import java.util.Arrays;


public class next_greater_element1 {
public static void main(String[] args) {
    int nums1[]={2,4};
    int nums2[]={1,2,3,4};
    System.err.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
}
public static int[] nextGreaterElement(int[] nums1, int[] nums2){
    int [] arr = new int[nums1.length];
    for (int i = 0; i <nums1.length; i++) {
        for (int j = 0; j <nums2.length; j++) {
            if(nums1[i]==nums2[j]){
                for (int k=j; k<nums2.length; k++) {
                    if(nums2[k]>nums2[j]){
                        arr[i]=nums2[k];
                        break;
                    }
                    else{
                        arr[i]=-1;  
                    }
                }

                }
                
            }
        }
    
    return arr;
}
}
