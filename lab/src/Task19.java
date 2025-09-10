import java.util.*;

public class Task19 {
    public static int[] mergeArrays(int[] a, int[] b) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int n : a) set.add(n);
        for (int n : b) set.add(n);
        int[] res = new int[set.size()];
        int i = 0;
        for (int v : set) res[i++] = v;
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {3,4,5,2};
        System.out.println(Arrays.toString(mergeArrays(a, b)));
    }
}
