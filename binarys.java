
import java.util.Arrays;

public class binarys {

    public static int binarysearch(int[] num, int target, int low, int high) {

        for (int i = 0; i < num.length; i++) {
            int mid = (low + high) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {1, 4, 5, 2, 3, 9, 7, 6, 8, 0};
        int n = num.length;
        Arrays.sort(num);
        System.err.println("array after sorting ==>" + Arrays.toString(num));
        int target = 5;
        binarys ob = new binarys();
        int result = ob.binarysearch(num, target, 0, n - 1);
        if (result == -1) {
            System.err.println("not found");
        } else {
            System.err.println("element found at index :" + result);
        }

    }
}
