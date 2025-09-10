import java.util.Arrays;

public class Task23 {
    public static int[] leftRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr;
        k = ((k % n) + n) % n;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(a, 2)));
    }
}
