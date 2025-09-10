import java.util.*;

public class Task17 {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int n : arr) set.add(n);
        int[] res = new int[set.size()];
        int i = 0;
        for (int v : set) res[i++] = v;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        int[] res = removeDuplicates(arr);
        System.out.println(Arrays.toString(res));
    }
}
