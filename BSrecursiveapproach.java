
import java.util.Arrays;

public class BSrecursiveapproach {

    public static int bsrecursive(int[] d, int target, int h, int l) {
        for (int i = 0; i < d.length; i++) {
            int mid = l + (h - l) / 2;
            if (l > h) {
                return 0;
            } else {
                if (d[mid] == target) {
                    return mid;
                } else if (d[mid] < target) {
                    return bsrecursive(d, target, h, mid + 1);
                } else {
                    return bsrecursive(d, target, mid - 1, l);
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int d[] = {1, 4, 5, 2, 3, 9, 7, 6, 8, 0};
        int n = d.length;
        Arrays.sort(d);
        System.err.println("array after sorting ==>" + Arrays.toString(d));
        BSrecursiveapproach bs = new BSrecursiveapproach();
        int result = bs.bsrecursive(d, 3, n - 1, 0);
        if (result == -1) {
            System.err.println("element not in array");
        } else {
            System.err.println("element at index:" + result);

        }
    }
}
