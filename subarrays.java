
public class subarrays {

    public static void subarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.err.print(arr[k] + " ");
                }
                System.err.println();
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8,10};
        subarray(arr);
    }

}
