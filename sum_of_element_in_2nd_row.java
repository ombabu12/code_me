public class sum_of_element_in_2nd_row {
    public static int sum_in_2nd_row(int nums[][]){
        int sum=0;
        
            for (int j = 0; j <nums[0].length; j++) {
                sum+=nums[1][j];
            }
        
        return sum;
    }
public static void main(String[] args) {
    int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
    System.err.println(sum_in_2nd_row(nums));

}
}
