public class Task18 {
    public static Integer secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return null;
        Integer max = null, second = null;
        for (int n : arr) {
            if (max == null || n > max) {
                second = max;
                max = n;
            } else if ((second == null || n > second) && n < max) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        Integer sec = secondLargest(arr);
        if (sec == null) System.out.println("Second largest doesn't exist");
        else System.out.println("Second largest: " + sec); // 15
    }
}
